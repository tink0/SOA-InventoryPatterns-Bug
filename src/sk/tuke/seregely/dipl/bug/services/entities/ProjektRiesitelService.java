package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Projekt;
import sk.tuke.seregely.dipl.bug.entity.ProjektRiesitel;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;

@WebService()
public class ProjektRiesitelService {

	final EntityDAO<ProjektRiesitel> projektDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.ProjektRiesitel","id");

	@WebMethod()
	public ProjektRiesitel retrieve(int id) {
		return projektDAO.findById(id);
	}
	
	@WebMethod()
	public ProjektRiesitel create(Projekt projekt, Riesitel riesitel) {
		ProjektRiesitel novyProjekt = new ProjektRiesitel();

		novyProjekt.setProjekt(projekt);
		novyProjekt.setRiesitel(riesitel);

		projektDAO.persist(novyProjekt);
		
		return novyProjekt;
	}
	
	@WebMethod()
	public void delete(int id) {
		ProjektRiesitel toDelete;
		toDelete = projektDAO.findById(id);
		projektDAO.delete(toDelete);
	}
	
	@WebMethod()
	public ProjektRiesitel update(ProjektRiesitel projekt) {
		return projektDAO.merge(projekt);
	}
	
	
}
