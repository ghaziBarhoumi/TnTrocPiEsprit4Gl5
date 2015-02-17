package Persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Report
 *
 */
@Entity
public class Report implements Serializable {

	private int idReport;
	private String Statut;
	private String Description;
	private User user = new User();
	private static final long serialVersionUID = 1L;

	public Report() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdReport() {
		return this.idReport;
	}

	public void setIdReport(int idReport) {
		this.idReport = idReport;
	}

	public String getStatut() {
		return this.Statut;
	}

	public void setStatut(String Statut) {
		this.Statut = Statut;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
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
