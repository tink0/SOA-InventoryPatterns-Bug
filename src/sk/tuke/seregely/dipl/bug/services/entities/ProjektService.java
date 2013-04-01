package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.CiselnikStavov;
import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Projekt;

@WebService()
public class ProjektService {

	final EntityDAO<Projekt> projektDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.Projekt","id_projektu");

	@WebMethod()
	public Projekt retrieve(int id) {
		return projektDAO.findById(id);
	}
	
	@WebMethod()
	public Projekt create(String nazov, String popis) {
		Projekt novyProjekt = new Projekt();

		novyProjekt.setNazov(nazov);
		novyProjekt.setPopis(popis);

		projektDAO.persist(novyProjekt);
		
		return novyProjekt;
	}
	
	@WebMethod()
	public void delete(int id) {
		Projekt toDelete;
		toDelete = projektDAO.findById(id);
		projektDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Projekt update(Projekt projekt) {
		return projektDAO.merge(projekt);
	}
	
	
}
