package tn.edu.esprit.tnTrocServices;


import javax.ejb.Remote;

import Persistence.User;



@Remote
public interface UserRemote {
	
	public User authenticate(String login, String password);

	public User findbylogin(String login);

}
