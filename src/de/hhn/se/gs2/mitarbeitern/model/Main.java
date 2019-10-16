package de.hhn.se.gs2.mitarbeitern.model;

/**
 * 
 * @author cmocanu
 * 
 * */

public class Main {

	public static void main(String args[]) {
				
		Angestellter cezar = new Angestellter("Cezar", "Mocanu", 3256.2f);
		ATAngestellter teo = new ATAngestellter("Teodor", "Birghisan", 2500);
		Zeitarbeiter fabian = new Zeitarbeiter("Fabian", "Bertea",4.7f);
	
		
		cezar.setGearbeiteteUeberstunden(23);
		fabian.setGearbeiteStunden(123);
		
		System.out.println(cezar.getVorname()+" "+cezar.getNachname()+" bekommt "+cezar.entgeltBerechnen()+" monatlich und "+cezar.entgeltBerechnen() * 12+" jaehrlich");
		System.out.println(teo.getVorname()+" "+teo.getNachname()+" bekommt "+teo.entgeltBerechnen()+" monatlich und "+teo.entgeltBerechnen()*12+" jaehrlich");
		System.out.println(fabian.getVorname()+" "+fabian.getNachname()+" bekommt "+fabian.entgeltBerechnen()+" monatlich und "+fabian.entgeltBerechnen()*12+" jaehrlich");
	}
}
