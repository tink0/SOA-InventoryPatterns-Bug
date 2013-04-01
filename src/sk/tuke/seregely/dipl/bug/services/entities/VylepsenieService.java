package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Projekt;
import sk.tuke.seregely.dipl.bug.entity.Uzivatel;
import sk.tuke.seregely.dipl.bug.entity.UzivatelProjekt;
import sk.tuke.seregely.dipl.bug.entity.Vylepsenie;

@WebService()
public class VylepsenieService {

	final EntityDAO<Vylepsenie> uzivatelDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.Vylepsenie","id_vylepsenia");

	@WebMethod()
	public Vylepsenie retrieve(int id) {
		return uzivatelDAO.findById(id);
	}
	
	@WebMethod()
	public Vylepsenie create(String popis, Uzivatel uzivatel) {
		Vylepsenie noveVylepsenie = new Vylepsenie();

		noveVylepsenie.setPopis(popis);
		noveVylepsenie.setUzivatel(uzivatel);
		
		uzivatelDAO.persist(noveVylepsenie);
		
		return noveVylepsenie;
	}
	
	@WebMethod()
	public void delete(int id) {
		Vylepsenie toDelete;
		toDelete = uzivatelDAO.findById(id);
		uzivatelDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Vylepsenie update(Vylepsenie uzivatel) {
		return uzivatelDAO.merge(uzivatel);
	}
	
	
}