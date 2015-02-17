package Persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: SwappingParties
 *
 */
@Entity
public class SwappingParties implements Serializable {

	private int IdParty;
	private String Description;
	private Date Date;
	private String Title;
	private String Places;

	private User user = new User();
	private static final long serialVersionUID = 1L;

	public SwappingParties() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdParty() {
		return this.IdParty;
	}

	public void setIdParty(int IdParty) {
		this.IdParty = IdParty;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public Date getDate() {
		return this.Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}

	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getPlaces() {
		return this.Places;
	}

	public void setPlaces(String Places) {
		this.Places = Places;
	}

	@ManyToOne
	@JoinColumn(name = "idUser")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
