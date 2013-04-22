package sk.tuke.seregely.dipl.bug.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectDAO extends EntityDAO<Projekt>{

	public ProjectDAO(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
	public Riesitel getVeduciProjektu(int idProjektu) {
		Session session = super.sessionFactory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("from sk.tuke.seregely.dipl.bug.entity.ProjektRiesitel where id_projektu = :id");
			query.setInteger("id", idProjektu);
			List<ProjektRiesitel> l = query.list();
			for(ProjektRiesitel up: l) {
				if(up.getRiesitel().isVeduci()) {
					return up.getRiesitel();
				}
			}
			tx.commit();
			
		} catch (RuntimeException re) {
		
			throw re;
		}
		
		return null;
	}

}
