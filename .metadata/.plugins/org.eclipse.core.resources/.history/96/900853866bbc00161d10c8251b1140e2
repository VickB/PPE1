package modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ROLES_UTILISATEUR")
public class Roles_Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idru;
	@Temporal(TemporalType.TIMESTAMP)
	private Date derniere_mise_a_jour;
	@Column(nullable=false)
	private String modifie_par;
	@ManyToOne
	@JoinColumn(name = "utilisateur_FK")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name = "role_FK")
	private Role roleu;

	public Roles_Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles_Utilisateur(Date derniere_mise_a_jour, String modifie_par, Utilisateur utilisateur, Role roleu) {
		super();
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
		this.utilisateur = utilisateur;
		this.roleu = roleu;
	}

	public Date getDerniere_mise_a_jour() {
		return derniere_mise_a_jour;
	}

	public void setDerniere_mise_a_jour(Date derniere_mise_a_jour) {
		this.derniere_mise_a_jour = derniere_mise_a_jour;
	}

	public String getModifie_par() {
		return modifie_par;
	}

	public void setModifie_par(String modifie_par) {
		this.modifie_par = modifie_par;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Role getRoleu() {
		return roleu;
	}

	public void setRoleu(Role roleu) {
		this.roleu = roleu;
	}

	@Override
	public String toString() {
		return "Roles_Utilisateur [derniere_mise_a_jour=" + derniere_mise_a_jour + ", modifie_par=" + modifie_par
				+ ", utilisateur=" + utilisateur + ", roleu=" + roleu + "]";
	}

}
