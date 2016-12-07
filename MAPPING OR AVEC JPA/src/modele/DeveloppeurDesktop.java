package modele;

import java.util.List;

public class DeveloppeurDesktop extends Developpeur{
	
	private boolean certifié_LINUX;

	public DeveloppeurDesktop() {
		super();
		
	}

	public DeveloppeurDesktop(String nom, String prenom, String ancienneté,
			boolean certifié_LINUX) {
		super(nom, prenom, ancienneté);
		this.certifié_LINUX = certifié_LINUX;
	}



	public boolean isCertifié_LINUX() {
		return certifié_LINUX;
	}

	public void setCertifié_LINUX(boolean certifié_LINUX) {
		this.certifié_LINUX = certifié_LINUX;
	}

	@Override
	public void informations() {
		
		
	}

	@Override
	public void rechercheProjets(String langage) {
		
		
	}
	

}
