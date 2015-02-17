package Persistence;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Swapper extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	public Swapper() {
		super();

	}

	public Swapper(String login, String password) {


	}

	@Override
	public String toString() {

		return super.toString();

	}
}