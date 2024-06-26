// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class AdminPurgePostView {
	@SerializedName("admin_purge_post")
	private AdminPurgePost adminPurgePost;
	private Person admin;
	private Community community;

	public AdminPurgePostView(AdminPurgePost adminPurgePost, Person admin, Community community) {
		this.adminPurgePost = adminPurgePost;
		this.admin = admin;
		this.community = community;
	}

	public AdminPurgePost getAdminPurgePost() {
	    return adminPurgePost;
	}

	public void setAdminPurgePost(AdminPurgePost adminPurgePost) {
	    this.adminPurgePost = adminPurgePost;
	}

	public Person getAdmin() {
	    return admin;
	}

	public void setAdmin(Person admin) {
	    this.admin = admin;
	}

	public Community getCommunity() {
	    return community;
	}

	public void setCommunity(Community community) {
	    this.community = community;
	}
}