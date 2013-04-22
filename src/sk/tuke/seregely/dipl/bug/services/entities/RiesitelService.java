package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Projekt;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;

@WebService()
public class RiesitelService {

	final EntityDAO<Riesitel> riesitelDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.Riesitel","id_riesitela");

	@WebMethod()
	public Riesitel retrieve(int id) {
		return riesitelDAO.findById(id);
	}
	
	@WebMethod()
	public Riesitel create(String celeMeno, Riesitel riesitel) {
		Riesitel novyRiesitel = new Riesitel();

		novyRiesitel.setCeleMeno(celeMeno);
		
		riesitelDAO.persist(novyRiesitel);
		
		return novyRiesitel;
	}
	
	@WebMethod()
	public void delete(int id) {
		Riesitel toDelete;
		toDelete = riesitelDAO.findById(id);
		riesitelDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Riesitel update(Riesitel riesitel) {
		return riesitelDAO.merge(riesitel);
	}
	
	
}
