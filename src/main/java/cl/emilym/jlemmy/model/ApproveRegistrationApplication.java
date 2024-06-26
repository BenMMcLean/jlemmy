// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ApproveRegistrationApplication {
	private long id;
	private boolean approve;
	@SerializedName("deny_reason")
	private String denyReason;

	public ApproveRegistrationApplication(long id, boolean approve, String denyReason) {
		this.id = id;
		this.approve = approve;
		this.denyReason = denyReason;
	}

	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}

	public boolean getApprove() {
	    return approve;
	}

	public void setApprove(boolean approve) {
	    this.approve = approve;
	}

	public String getDenyReason() {
	    return denyReason;
	}

	public void setDenyReason(String denyReason) {
	    this.denyReason = denyReason;
	}
}