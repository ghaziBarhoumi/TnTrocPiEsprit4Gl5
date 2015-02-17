package tn.edu.esprit.tnTrocServices;

import java.util.List;

import javax.ejb.Remote;

import Persistence.SwappingParties;

@Remote
public interface PartyRemote {

	public void create(SwappingParties swappingParties);

	public void update(SwappingParties swappingParties);

	public void del(int id);

	public List<SwappingParties> listParties();

	public SwappingParties FindById(int id);

}
