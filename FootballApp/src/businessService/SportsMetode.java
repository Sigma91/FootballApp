package businessService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Sports;

public class SportsMetode {
private SessionFactory sf = new Configuration().configure().buildSessionFactory();
private Session session = sf.openSession();

public boolean ubaciSport (String sportsName) {
	Sports sport = new Sports();
	try {
		sport.setName(sportsName);
		session.save(sport);
		session.getTransaction().commit();
		System.out.println("Uspesan unos");
	}catch (Exception e) {
		session.getTransaction().rollback();
		System.out.println("Neuspesan unos");
	} return false;

 }
}
