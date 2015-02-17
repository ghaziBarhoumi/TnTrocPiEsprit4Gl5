package tn.edu.esprit.tnTrocServices;

import java.util.List;

import javax.ejb.Remote;

import Persistence.Report;

@Remote
public interface ReportRemote {

	public void create(Report report);

	public void update(Report report);

	public void del(int id);

	public List<Report> listReport();

	public Report FindById(int id);

}
