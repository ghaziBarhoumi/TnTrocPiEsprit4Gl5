package Persistence;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Administrator extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Administrator() {
	}

	public  Administrator(String login, String password) {


	}

	@Override
	public String toString() {

		return super.toString();

	}

}
