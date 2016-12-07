package modele;

import java.util.List;

public class DeveloppeurWeb extends Developpeur {
	
	private boolean graphiste;
	private boolean certifié_JAVAEE;

	public DeveloppeurWeb() {
		super();
	
	}

	public DeveloppeurWeb(String nom, String prenom, String ancienneté, boolean graphiste,
			boolean certifié_JAVAEE) {
		super(nom, prenom, ancienneté);
		this.graphiste = graphiste;
		this.certifié_JAVAEE = certifié_JAVAEE;
	}

	public boolean isGraphiste() {
		return graphiste;
	}

	public void setGraphiste(boolean graphiste) {
		this.graphiste = graphiste;
	}

	public boolean isCertifié_JAVAEE() {
		return certifié_JAVAEE;
	}

	public void setCertifié_JAVAEE(boolean certifié_JAVAEE) {
		this.certifié_JAVAEE = certifié_JAVAEE;
	}

	@Override
	public void informations() {
		
		
	}

	@Override
	public void rechercheProjets(String langage) {
		
	}


	
}
