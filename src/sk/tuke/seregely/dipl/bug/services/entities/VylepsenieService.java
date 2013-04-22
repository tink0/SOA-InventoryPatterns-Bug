package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.CiselnikStavov;
import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Projekt;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;
import sk.tuke.seregely.dipl.bug.entity.Uzivatel;
import sk.tuke.seregely.dipl.bug.entity.Vylepsenie;

@WebService()
public class VylepsenieService {

	final EntityDAO<Vylepsenie> vylepsenieDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.Vylepsenie","id_vylepsenia");

	@WebMethod()
	public Vylepsenie retrieve(int id) {
		return vylepsenieDAO.findById(id);
	}
	
	@WebMethod()
	public Vylepsenie create(String popis, Uzivatel uzivatel) {
		Vylepsenie noveVylepsenie = new Vylepsenie();

		noveVylepsenie.setPopis(popis);
		noveVylepsenie.setUzivatel(uzivatel);
		
		vylepsenieDAO.persist(noveVylepsenie);
		
		return noveVylepsenie;
	}
	
	@WebMethod()
	public Vylepsenie createWithProjekt(String popis, Uzivatel uzivatel, Projekt projekt) {
		Vylepsenie novaChyba = new Vylepsenie();
	
		novaChyba.setPopis(popis);
		novaChyba.setUzivatel(uzivatel);
		novaChyba.setProjekt(projekt);

		vylepsenieDAO.persist(novaChyba);
		
		return novaChyba;
	}
	
	@WebMethod()
	public void delete(int id) {
		Vylepsenie toDelete;
		toDelete = vylepsenieDAO.findById(id);
		vylepsenieDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Vylepsenie update(Vylepsenie uzivatel) {
		return vylepsenieDAO.merge(uzivatel);
	}
	
	@WebMethod()
	public Vylepsenie updateWithRiesitelStav(Vylepsenie vyl, Riesitel rie, CiselnikStavov stav ) {
		vyl.setCiselnikStavov(stav);
		vyl.setRiesitel(rie);
		vylepsenieDAO.merge(vyl);
		return vyl;
	}
	
	
}