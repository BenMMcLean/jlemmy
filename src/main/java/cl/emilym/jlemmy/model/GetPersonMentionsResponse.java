// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetPersonMentionsResponse {
	private PersonMentionView[] mentions;

	public GetPersonMentionsResponse(PersonMentionView[] mentions) {
		this.mentions = mentions;
	}

	public PersonMentionView[] getMentions() {
	    return mentions;
	}

	public void setMentions(PersonMentionView[] mentions) {
	    this.mentions = mentions;
	}
}