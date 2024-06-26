// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class FeaturePost {
	@SerializedName("post_id")
	private long postId;
	private boolean featured;
	@SerializedName("feature_type")
	private PostFeatureType featureType;

	public FeaturePost(long postId, boolean featured, PostFeatureType featureType) {
		this.postId = postId;
		this.featured = featured;
		this.featureType = featureType;
	}

	public long getPostId() {
	    return postId;
	}

	public void setPostId(long postId) {
	    this.postId = postId;
	}

	public boolean getFeatured() {
	    return featured;
	}

	public void setFeatured(boolean featured) {
	    this.featured = featured;
	}

	public PostFeatureType getFeatureType() {
	    return featureType;
	}

	public void setFeatureType(PostFeatureType featureType) {
	    this.featureType = featureType;
	}
}