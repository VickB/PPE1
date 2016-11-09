package test;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modele.Action;
import modele.Role;
import modele.Utilisateur;

public class Creation {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("depotvente");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); 
		
		Utilisateur u1 = new Utilisateur("victoria.bolongo@gmail.com", "Bolongo", "Victoria", new Date(), "Victoria");
		Utilisateur u2 = new Utilisateur("charles.bertrand@gmail.com", "Bertrand", "Charles", new Date(), "Charles");
		Utilisateur u3 = new Utilisateur("marie.dupont@gmail.com", "Dupont", "Marie", new Date(), "Marie");
		
		Role r1 = new Role(new Date(),"administrateur","annonceur");
		Role r2 = new Role(new Date(),"administrateur","magasin");
		Role r3 = new Role(new Date(),"administrateur","administrateur");
		
		Action a1 = new Action("rediger son annonce",new Date(),"administrateur","annonce");
		Action a2 = new Action("gérer son annonce",new Date(),"administrateur","annonce");
		Action a3 = new Action("accepter une guitare en dépôt-vente",new Date(),"administrateur","annonce");
		Action a4 = new Action("vendre une guitare",new Date(),"administrateur","annonce");
		
		
		em.persist(u1);
		em.persist(u2);
		em.persist(u3);
		
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		
		em.getTransaction().commit();
		
		em.close();
        emf.close();
		
	}

}
