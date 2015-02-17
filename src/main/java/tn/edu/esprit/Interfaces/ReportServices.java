package tn.edu.esprit.Interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.tnTrocServices.ReportRemote;
import Persistence.Report;

/**
 * Session Bean implementation class ReportServices
 */
@Stateless
public class ReportServices implements ReportRemote {

	@PersistenceContext(unitName = "")
	private EntityManager em;

	public ReportServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(Report report) {
		em.persist(report);

	}

	@Override
	public void update(Report report) {
		em.merge(report);

	}

	@Override
	public void del(int id) {
		em.remove(FindById(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Report> listReport() {
		return em.createQuery("Select u from Report u").getResultList();
	}

	@Override
	public Report FindById(int id) {
		return em.find(Report.class, id);
	}

}
