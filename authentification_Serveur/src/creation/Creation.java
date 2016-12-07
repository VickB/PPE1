package creation;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modele.Action;
import modele.Role;
import modele.Utilisateur;

public class Creation {
	

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("authentification");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); 
		
		Utilisateur u1 = new Utilisateur("victoria.bolongo@gmail.com","victoria", "Bolongo", "Victoria", new Date(), "Victoria");
		Utilisateur u2 = new Utilisateur("charles.bertrand@gmail.com","charles", "Bertrand", "Charles", new Date(), "Charles");
		Utilisateur u3 = new Utilisateur("marie.dupont@gmail.com","marie", "Dupont", "Marie", new Date(), "Marie");
		
		Role r1 = new Role("administrateur","gerant application",new Date(),"Victoria");
		Role r2 = new Role("magasin","gerant de l'annonce",new Date(),"Victoria");
		Role r3 = new Role("particulier","gerant de l'annonce",new Date(),"Victoria");
		
		Action a1 = new Action("rediger son annonce","rediger son annonce",new Date(),"administrateur");
		Action a2 = new Action("gérer son annonce","gérer son annonce",new Date(),"administrateur");
		Action a3 = new Action("accepter une guitare en dépôt-vente","accepter une guitare en dépôt-vente",new Date(),"administrateur");
//		Action a4 = new Action("vendre une guitare","vendre une guitare",new Date(),"administrateur");
		
		
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		
		r1.ajoutAction(a1);
		r2.ajoutAction(a2);
		r3.ajoutAction(a3);
		
		r1.ajoutUtilisateur(u1);
		r2.ajoutUtilisateur(u2);
		r2.ajoutUtilisateur(u3);
		
		
	
		
		em.getTransaction().commit();
		
		em.close();
        emf.close();
		
	}

}
