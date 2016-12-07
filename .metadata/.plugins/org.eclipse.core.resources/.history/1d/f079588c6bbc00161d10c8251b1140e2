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
@Table(name = "ACTION")
public class Action {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ida;
	@Column(nullable=false)
	private String action;
	@Temporal(TemporalType.TIMESTAMP)
	private Date derniere_mise_a_jour;
	@Column(nullable=false)
	private String modifie_par;
	@Column(nullable=false)
	private String description;
	@OneToMany(mappedBy = "action", cascade = CascadeType.ALL)
	private List<Roles_Action> roles_action = new ArrayList<>();

	public Action() {
		super();
	}

	public Action(String action, Date derniere_mise_a_jour, String modifie_par, String description) {
		super();
		this.action = action;
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
		this.description = description;
	}
	
	public void AjoutRoleA(Roles_Action nouveau){
		roles_action.add(nouveau);
		nouveau.setAction(this);
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public List<Roles_Action> getRoles_action() {
		return roles_action;
	}

	public void setRoles_action(List<Roles_Action> roles_action) {
		this.roles_action = roles_action;
	}

	@Override
	public String toString() {
		return "Action [action=" + action + ", derniere_mise_a_jour=" + derniere_mise_a_jour + ", modifie_par="
				+ modifie_par + ", description=" + description + ", roles_action=" + roles_action + "]";
	}

}
