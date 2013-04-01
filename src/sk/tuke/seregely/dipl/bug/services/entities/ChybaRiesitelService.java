package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.Chyba;
import sk.tuke.seregely.dipl.bug.entity.ChybaRiesitel;
import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;

@WebService()
public class ChybaRiesitelService {
	
	final EntityDAO<ChybaRiesitel> chybaDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.ChybaRiesitel","id_chyby");

	@WebMethod()
	public ChybaRiesitel retrieve(int id) {
		return chybaDAO.findById(id);
	}
	
	@WebMethod()
	public ChybaRiesitel create(Chyba chyba, Riesitel riesitel) {
		ChybaRiesitel novaChyba = new ChybaRiesitel();
	
		novaChyba.setRiesitel(riesitel);
		novaChyba.setChyba(chyba);

		chybaDAO.persist(novaChyba);
		
		return novaChyba;
	}
	
	@WebMethod()
	public void delete(int id) {
		ChybaRiesitel toDelete;
		toDelete = chybaDAO.findById(id);
		chybaDAO.delete(toDelete);
	}
	
	@WebMethod()
	public ChybaRiesitel update(ChybaRiesitel chyba) {
		return chybaDAO.merge(chyba);
	}

}