package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.Chyba;
import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Uzivatel;

@WebService()
public class ChybaService {

	final EntityDAO<Chyba> chybaDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.Chyba","id_chyby");

	@WebMethod()
	public Chyba retrieve(int id) {
		return chybaDAO.findById(id);
	}
	
	@WebMethod()
	public Chyba create(String popis, Uzivatel uzivatel) {
		Chyba novaChyba = new Chyba();
	
		novaChyba.setPopis(popis);
		novaChyba.setUzivatel(uzivatel);

		chybaDAO.persist(novaChyba);
		
		return novaChyba;
	}
	
	@WebMethod()
	public void delete(int id) {
		Chyba toDelete;
		toDelete = chybaDAO.findById(id);
		chybaDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Chyba update(Chyba chyba) {
		return chybaDAO.merge(chyba);
	}
}
	
	