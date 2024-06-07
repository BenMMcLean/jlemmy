// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPostsResponse {
	private PostView[] posts;
	@SerializedName("next_page")
	private PaginationCursor nextPage;

	public GetPostsResponse(PostView[] posts, PaginationCursor nextPage) {
		this.posts = posts;
		this.nextPage = nextPage;
	}

	public PostView[] getPosts() {
	    return posts;
	}

	public void setPosts(PostView[] posts) {
	    this.posts = posts;
	}

	public PaginationCursor getNextPage() {
	    return nextPage;
	}

	public void setNextPage(PaginationCursor nextPage) {
	    this.nextPage = nextPage;
	}
}