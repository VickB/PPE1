package test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modele.Roles_Utilisateur;
import modele.Utilisateur;
import modele.Roles_Utilisateur;
import modele.Roles_Action;
import modele.Action;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("depotvente");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();   
        em.getTransaction().commit();
        em.close();
        emf.close();
   
		
		


	}

}
