package sk.tuke.seregely.dipl.bug.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.bug.entity.CiselnikStavov;
import sk.tuke.seregely.dipl.bug.entity.EntityDAO;

@WebService()
public class CiselnikStavovService {

	final EntityDAO<CiselnikStavov> ciselnikDAO = new EntityDAO("sk.tuke.seregely.dipl.bug.entity.CiselnikStavov","id_stavu");

	@WebMethod()
	public CiselnikStavov retrieve(int id) {
		return ciselnikDAO.findById(id);
	}
	
	@WebMethod()
	public CiselnikStavov create(String nazov) {
		CiselnikStavov novyStav = new CiselnikStavov();
	
		novyStav.setNazov(nazov);

		ciselnikDAO.persist(novyStav);
		
		return novyStav;
	}
	
	@WebMethod()
	public void delete(int id) {
		CiselnikStavov toDelete;
		toDelete = ciselnikDAO.findById(id);
		ciselnikDAO.delete(toDelete);
	}
	
	@WebMethod()
	public CiselnikStavov update(CiselnikStavov stav) {
		return ciselnikDAO.merge(stav);
	}
	
	
}
