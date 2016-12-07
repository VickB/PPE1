package modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import modele.Developpeur;


@Entity
@Table(name="DEVELOPPEUR")
public class Projet {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idp;
	@Column(nullable=false)
	private String nomp;
	@Column(nullable=false)
	private String langage;
	@Column(nullable=false)
	private int duree_joursHomme;
	@JoinColumn(name = "dev_FK")
	private Developpeur developpeur;
	
	public Projet() {
		super();
		
	}

	public Projet(int idp, String nomp, String langage, int duree_joursHomme, Developpeur developpeur) {
		super();
		this.idp = idp;
		this.nomp = nomp;
		this.langage = langage;
		this.duree_joursHomme = duree_joursHomme;
		this.developpeur = developpeur;
	}

	public String getNomp() {
		return nomp;
	}
	public void setNomp(String nomp) {
		this.nomp = nomp;
	}
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage = langage;
	}
	public int getDuree_joursHomme() {
		return duree_joursHomme;
	}
	public void setDuree_joursHomme(int duree_joursHomme) {
		this.duree_joursHomme = duree_joursHomme;
	}
	public Developpeur getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}



}