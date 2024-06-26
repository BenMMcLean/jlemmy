// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class CommunityView {
	private Community community;
	private SubscribedType subscribed;
	private boolean blocked;
	private CommunityAggregates counts;
	@SerializedName("banned_from_community")
	private boolean bannedFromCommunity;

	public CommunityView(Community community, SubscribedType subscribed, boolean blocked, CommunityAggregates counts, boolean bannedFromCommunity) {
		this.community = community;
		this.subscribed = subscribed;
		this.blocked = blocked;
		this.counts = counts;
		this.bannedFromCommunity = bannedFromCommunity;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}

	public SubscribedType getSubscribed() {
	    return subscribed;
	}

	public void setSubscribed(SubscribedType subscribed) {
	    this.subscribed = subscribed;
	}

	public boolean getBlocked() {
	    return blocked;
	}

	public void setBlocked(boolean blocked) {
	    this.blocked = blocked;
	}

	public CommunityAggregates getCounts() {
	    return counts;
	}

	public void setCounts(CommunityAggregates counts) {
	    this.counts = counts;
	}

	public boolean getBannedFromCommunity() {
	    return bannedFromCommunity;
	}

	public void setBannedFromCommunity(boolean bannedFromCommunity) {
	    this.bannedFromCommunity = bannedFromCommunity;
	}
}