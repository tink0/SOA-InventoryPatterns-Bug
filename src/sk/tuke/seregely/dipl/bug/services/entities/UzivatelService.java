package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;
import sk.tuke.seregely.dipl.bug.entity.Uzivatel;

@WebService()
public class UzivatelService {

	final EntityDAO<Uzivatel> uzivatelDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.Uzivatel","id_uzivatela");

	@WebMethod()
	public Uzivatel retrieve(int id) {
		return uzivatelDAO.findById(id);
	}
	
	@WebMethod()
	public Uzivatel create(String celeMeno, String email) {
		Uzivatel novyUzivatel = new Uzivatel();

		novyUzivatel.setEmail(email);
		novyUzivatel.setCeleMeno(celeMeno);
		
		uzivatelDAO.persist(novyUzivatel);
		
		return novyUzivatel;
	}
	
	@WebMethod()
	public void delete(int id) {
		Uzivatel toDelete;
		toDelete = uzivatelDAO.findById(id);
		uzivatelDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Uzivatel update(Uzivatel uzivatel) {
		return uzivatelDAO.merge(uzivatel);
	}
	
	
}