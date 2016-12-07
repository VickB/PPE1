package modele;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="DEVELOPPEUR")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
public abstract class Developpeur implements InterfaceDeveloppeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddev;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String date_embauche;
	@Column(nullable=false)
	private String ancienneté;
	@OneToMany()
	private List<Projet> projets = new ArrayList<>();
	
	
	public Developpeur() {
		super();
		
	}
	
	public Developpeur(String nom, String prenom, String ancienneté) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.ancienneté = ancienneté;
	}


	public void addProjet(Projet nouveau){
		projets.add(nouveau);
		nouveau.setDeveloppeur(this);
	}
	
	/*public abstract void informations(){
		
				
	}
	
	public abstract void rechercheProjets(String langage){
	
	
	*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_embauche() {
		return date_embauche;
	}
	public void setDate_embauche(String date_embauche) {
		this.date_embauche = date_embauche;
	}
	public String getAncienneté() {
		return ancienneté;
	}
	public void setAncienneté(String ancienneté) {
		this.ancienneté = ancienneté;
	}
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
	
	

}
