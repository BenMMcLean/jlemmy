// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPrivateMessages {
	@SerializedName("unread_only")
	private boolean unreadOnly;
	private long page;
	private long limit;
	@SerializedName("creator_id")
	private long creatorId;

	public GetPrivateMessages(boolean unreadOnly, long page, long limit, long creatorId) {
		this.unreadOnly = unreadOnly;
		this.page = page;
		this.limit = limit;
		this.creatorId = creatorId;
	}

	public boolean getUnreadOnly() {
	    return unreadOnly;
	}

	public void setUnreadOnly(boolean unreadOnly) {
	    this.unreadOnly = unreadOnly;
	}

	public long getPage() {
	    return page;
	}

	public void setPage(long page) {
	    this.page = page;
	}

	public long getLimit() {
	    return limit;
	}

	public void setLimit(long limit) {
	    this.limit = limit;
	}

	public long getCreatorId() {
	    return creatorId;
	}

	public void setCreatorId(long creatorId) {
	    this.creatorId = creatorId;
	}
}