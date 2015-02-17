package Persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
public class User implements Serializable {

	private int id;
	private String login;
	private String password;
	private String FirstName;
	private String LastName;
	private Date DateOfbirth;
	private String Adress;
	private String Telephone;
	private String Mail;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDateOfbirth() {
		return this.DateOfbirth;
	}

	public void setDateOfbirth(Date DateOfbirth) {
		this.DateOfbirth = DateOfbirth;
	}

	public String getAdress() {
		return this.Adress;
	}

	public void setAdress(String Adress) {
		this.Adress = Adress;
	}

	public String getTelephone() {
		return this.Telephone;
	}

	public void setTelephone(String Telephone) {
		this.Telephone = Telephone;
	}

	public String getMail() {
		return this.Mail;
	}

	public void setMail(String Mail) {
		this.Mail = Mail;
	}

}
