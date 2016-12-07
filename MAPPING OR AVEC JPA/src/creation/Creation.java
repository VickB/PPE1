package creation;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modele.Developpeur;
import modele.DeveloppeurDesktop;
import modele.DeveloppeurWeb;
import modele.Projet;


public class Creation {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manageur");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin(); 
		
		Developpeur d1 = new DeveloppeurDesktop("Bolongo", "Victoria","2",true);
		
		em.persist(d1);
		em.getTransaction().commit();
		em.close();
        emf.close();

	}
	}

