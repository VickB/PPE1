package dateoutils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class CalculAnciennete {
	
	public int calculer(Date dateEmbauche) {
		LocalDate aujourdhui = LocalDate.now();
		LocalDate embauche = dateEmbauche.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Period periode = Period.between(embauche, aujourdhui);
		return periode.getYears();		
	}
	
	public static CalculAnciennete getInstance() {
		if(instance == null)
			instance = new CalculAnciennete();
		
		return instance;
	}
	
	private static CalculAnciennete instance = null;

	private CalculAnciennete() {
		super();
	}
	

}
