package tn.edu.esprit.Interfaces;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import javax.persistence.Query;


import Persistence.User;

import tn.edu.esprit.tnTrocServices.UserRemote;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
@LocalBean
public class UserServices implements UserRemote {

	@PersistenceContext(unitName = "")
	private EntityManager em;
	
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User authenticate(String login, String password) {
		User found = null;
		String jpql = "select u from User u where u.login=:p1 and u.password=:p2";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", login);
		query.setParameter("p2", password);
		try {
			found = (User) query.getSingleResult();
		} catch (Exception e) {
		}

		return found;
	}

	@Override
	public User findbylogin(String login) {
		User found = null;
		String jpql = "select u from User u where u.login=:p1";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", login);
		try {
			found = (User) query.getSingleResult();
		} catch (Exception e) {
		}

		return found;
	}

	}


