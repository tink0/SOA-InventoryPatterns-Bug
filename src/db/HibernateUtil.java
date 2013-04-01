package db;

import javax.naming.InitialContext;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sk.tuke.seregely.dipl.bug.entity.Chyba;
import sk.tuke.seregely.dipl.bug.entity.ChybaRiesitel;
import sk.tuke.seregely.dipl.bug.entity.CiselnikStavov;
import sk.tuke.seregely.dipl.bug.entity.Projekt;
import sk.tuke.seregely.dipl.bug.entity.ProjektRiesitel;
import sk.tuke.seregely.dipl.bug.entity.Riesitel;
import sk.tuke.seregely.dipl.bug.entity.Uzivatel;
import sk.tuke.seregely.dipl.bug.entity.UzivatelProjekt;
import sk.tuke.seregely.dipl.bug.entity.Vylepsenie;
import sk.tuke.seregely.dipl.bug.entity.VylepsenieRiesitel;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
           Configuration configuration = new Configuration()
   		 .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
   		 .setProperty("hibernate.connection.driver_class", 
   		 "org.postgresql.Driver")
   		 .setProperty("hibernate.connection.url", 
   		 "jdbc:postgresql://localhost/postgres")
   		 .setProperty("hibernate.connection.username", "postgres")
   		 .setProperty("hibernate.current_session_context_class","org.hibernate.context.ThreadLocalSessionContext")
   		 .setProperty("hibernate.connection.password", "superpass")
   		 .addClass(Chyba.class)
   		 .addClass(ChybaRiesitel.class)
   		 .addClass(CiselnikStavov.class)
   		 .addClass(Projekt.class)
   		 .addClass(ProjektRiesitel.class)
   		 .addClass(Riesitel.class)
   		 .addClass(Vylepsenie.class)
   		 .addClass(VylepsenieRiesitel.class)
   		 .addClass(Uzivatel.class)
   		 .addClass(UzivatelProjekt.class);
   		 
           
           SessionFactory sessFact = configuration.buildSessionFactory();
           InitialContext ctx = new InitialContext();
            return sessFact;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}