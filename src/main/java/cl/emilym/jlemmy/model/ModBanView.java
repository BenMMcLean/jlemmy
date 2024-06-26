// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ModBanView {
	@SerializedName("mod_ban")
	private ModBan modBan;
	private Person moderator;
	@SerializedName("banned_person")
	private Person bannedPerson;

	public ModBanView(ModBan modBan, Person moderator, Person bannedPerson) {
		this.modBan = modBan;
		this.moderator = moderator;
		this.bannedPerson = bannedPerson;
	}

	public ModBan getModBan() {
	    return modBan;
	}

	public void setModBan(ModBan modBan) {
	    this.modBan = modBan;
	}

	public Person getModerator() {
	    return moderator;
	}

	public void setModerator(Person moderator) {
	    this.moderator = moderator;
	}

	public Person getBannedPerson() {
	    return bannedPerson;
	}

	public void setBannedPerson(Person bannedPerson) {
	    this.bannedPerson = bannedPerson;
	}
}