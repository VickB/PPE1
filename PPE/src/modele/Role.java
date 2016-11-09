package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idr;
	@Temporal(TemporalType.TIMESTAMP)
	private Date derniere_mise_a_jour;
	@Column(nullable=false)
	private String modifie_par;
	@Column(nullable=false)
	private String description;
	@OneToMany(mappedBy = "roleu", cascade = CascadeType.ALL)
	private List<Roles_Utilisateur> roles = new ArrayList<>();
	@OneToMany(mappedBy = "rolea", cascade = CascadeType.ALL)
	private List<Roles_Action> roles_action = new ArrayList<>();

	public Role() {
		super();
		
	}

	public Role(Date derniere_mise_a_jour, String modifie_par, String description) {
		super();
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
		this.description = description;
	}
	
	public void AjoutRole(Roles_Utilisateur nouveau){
			roles.add(nouveau);
			nouveau.setRoleu(this);
	}
	
	public void AjoutRoleAction(Roles_Action nouveau){
		roles_action.add(nouveau);
		nouveau.setRolea(this);
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Roles_Utilisateur> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles_Utilisateur> roles) {
		this.roles = roles;
	}

	public List<Roles_Action> getRoles_action() {
		return roles_action;
	}

	public void setRoles_action(List<Roles_Action> roles_action) {
		this.roles_action = roles_action;
	}

	@Override
	public String toString() {
		return "Role [derniere_mise_a_jour=" + derniere_mise_a_jour + ", modifie_par=" + modifie_par + ", description="
				+ description + ", roles=" + roles + ", roles_action=" + roles_action + "]";
	}

}
