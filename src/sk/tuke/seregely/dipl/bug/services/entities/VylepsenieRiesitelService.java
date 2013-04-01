package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.EntityDAO;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;
import sk.tuke.seregely.dipl.bug.entity.Vylepsenie;
import sk.tuke.seregely.dipl.bug.entity.VylepsenieRiesitel;

@WebService()
public class VylepsenieRiesitelService {

	final EntityDAO<VylepsenieRiesitel> vylepsenieRiesitelDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.VylepsenieRiesitel","id");

	@WebMethod()
	public VylepsenieRiesitel retrieve(int id) {
		return vylepsenieRiesitelDAO.findById(id);
	}
	
	@WebMethod()
	public VylepsenieRiesitel create(Vylepsenie vylepsenie, Riesitel riesitel) {
		VylepsenieRiesitel noveVylepsenie = new VylepsenieRiesitel();
		
		
		noveVylepsenie.setRiesitel(riesitel);
		noveVylepsenie.setVylepsenie(vylepsenie);
		
		vylepsenieRiesitelDAO.persist(noveVylepsenie);
		
		return noveVylepsenie;
	}
	
	@WebMethod()
	public void delete(int id) {
		VylepsenieRiesitel toDelete;
		toDelete = vylepsenieRiesitelDAO.findById(id);
		vylepsenieRiesitelDAO.delete(toDelete);
	}
	
	@WebMethod()
	public VylepsenieRiesitel update(VylepsenieRiesitel vylepsenie) {
		return vylepsenieRiesitelDAO.merge(vylepsenie);
	}
	
	
}