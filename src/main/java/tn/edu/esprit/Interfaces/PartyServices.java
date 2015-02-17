package tn.edu.esprit.Interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.tnTrocServices.PartyRemote;
import Persistence.SwappingParties;

/**
 * Session Bean implementation class PartyServices
 */
@Stateless
public class PartyServices implements PartyRemote {

	@PersistenceContext(unitName = "")
	private EntityManager em;

	public PartyServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(SwappingParties swappingParties) {
		em.persist(swappingParties);

	}

	@Override
	public void update(SwappingParties swappingParties) {
		em.merge(swappingParties);

	}

	@Override
	public void del(int id) {
		em.remove(FindById(id));

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SwappingParties> listParties() {
		return em.createQuery("Select u from SwappingParties u")
				.getResultList();
	}

	@Override
	public SwappingParties FindById(int id) {
		return em.find(SwappingParties.class, id);
	}

}
