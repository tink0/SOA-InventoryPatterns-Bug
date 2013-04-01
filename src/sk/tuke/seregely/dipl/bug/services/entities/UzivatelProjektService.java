package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Projekt;
import sk.tuke.seregely.dipl.bug.entity.Uzivatel;
import sk.tuke.seregely.dipl.bug.entity.UzivatelProjekt;

@WebService()
public class UzivatelProjektService {

	final EntityDAO<UzivatelProjekt> uzivatelDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.UzivatelProjekt","id");

	@WebMethod()
	public UzivatelProjekt retrieve(int id) {
		return uzivatelDAO.findById(id);
	}
	
	@WebMethod()
	public UzivatelProjekt create(Uzivatel uzivatel, Projekt projekt) {
		UzivatelProjekt novyUzivatel = new UzivatelProjekt();

		novyUzivatel.setUzivatel(uzivatel);
		novyUzivatel.setProjekt(projekt);
		
		uzivatelDAO.persist(novyUzivatel);
		
		return novyUzivatel;
	}
	
	@WebMethod()
	public void delete(int id) {
		UzivatelProjekt toDelete;
		toDelete = uzivatelDAO.findById(id);
		uzivatelDAO.delete(toDelete);
	}
	
	@WebMethod()
	public UzivatelProjekt update(UzivatelProjekt uzivatel) {
		return uzivatelDAO.merge(uzivatel);
	}
	
	
}