package challenge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quote {
	
	@Id
	private Integer id;
	private String actor;
	private String quote;
	
	public Quote () {}
	
	public Quote(Integer id, String actor, String quote) {
		this.id = id;
		this.actor = actor;
		this.quote = quote;
	}

	public Integer getId() {
		return null;
	}

	public void setId(Integer id) {

	}

	public String getActor() {
		return null;
	}

	public void setActor(String actor) {

	}

	public String getQuote() {
		return null;
	}

	public void setQuote(String quote) {

	}

}
