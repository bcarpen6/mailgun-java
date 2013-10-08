package com.mailgun.api.resources;

import com.google.gson.Gson;
import com.mailgun.api.MailGunClient;
import com.mailgun.api.domain.Paging;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.core.MultivaluedMap;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

public abstract class ListResource<T> extends Resource implements Iterable<T>, Type {

	private class ListIterator implements Iterator<T> {
		private Iterator<T> itr;
		
		public ListIterator(Iterator<T> itr){
			this.itr = itr;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public boolean hasNext() {
			return this.itr.hasNext() || hasNextPage();
		}

		public T next() {
			if (this.itr.hasNext()) {
				return this.itr.next();
			}

			try {
				fetchNextPage();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			this.itr = getPageData().iterator();
				return this.itr.next();
			}		
	}
	
	public ListResource(MailGunClient client) {
		this(client, new  MultivaluedMapImpl());
	}
	
	protected void fetchNextPage() throws Exception {
		String path = StringUtils.remove(this.nextUri, this.getClient().getBaseUri().toString());
		ClientResponse response = this.getClient().getService().path(path).get(ClientResponse.class);
		this.parseResponse(response);
	}
	
	protected boolean hasNextPage() {
		return this.nextUri != null;
	}
	
	public ListResource(MailGunClient client, MultivaluedMap<String, String> filters) {
		super(client);
		this.filters = filters;
	}
	
	public Iterator<T> iterator() {
		return new ListIterator(getPageData().iterator());
	}

	public List<T> getPageData() {
		if (!this.isLoaded()) {
			try {
				this.load(this.filters);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return this.pageData;
	}
	
	protected List<T> pageData;
	private String nextUri = null;

	@Override
	protected void parseResponse(ClientResponse response) throws Exception {
		Gson gson = new Gson();
		ListResource obj = gson.fromJson(response.getEntity(String.class), this.getClass());
		this.pageData = obj.getItems();
		this.nextUri = (obj.getPaging() != null && obj.getItems().size() != 0) ? obj.getPaging().getNextUrl() : null;
	}

	protected abstract List getItems();
	protected abstract Integer getTotalCount();
	protected abstract Paging getPaging();
}
