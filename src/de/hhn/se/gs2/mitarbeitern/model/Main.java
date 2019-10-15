package de.hhn.se.gs2.mitarbeitern.model;

public class Main {

	public static void main(String args[]) {
		
//		//Mitarbeiter a = new Angestellter("Rudolf", "Smith", 3256.2f);
//		Mitarbeiter at = new ATAngestellter("Michael", "Straus", 2500);
//		Mitarbeiter z = new Zeitarbeiter("Klaus", "Bauer");
//		
		Angestellter rudolf = new Angestellter("Rudolf", "Smith", 3256.2f);
		ATAngestellter michael = new ATAngestellter("Michael", "Straus", 2500);
		Zeitarbeiter klaus = new Zeitarbeiter("Klaus", "Bauer",4.7f);
	
		
		rudolf.setGearbeiteteUeberstunden(23);
		klaus.setGearbeiteStunden(123);
		System.out.println(rudolf.getVorname()+" "+rudolf.getNachname()+" bekommt "+rudolf.entgeltBerechnen()+" moantlich und "+rudolf.entgeltBerechnen()*12+" jaehrlich");
		System.out.println(michael.getVorname()+" "+michael.getNachname()+" bekommt "+michael.entgeltBerechnen()+" moantlich und "+michael.entgeltBerechnen()*12+" jaehrlich");
		System.out.println(klaus.getVorname()+" "+klaus.getNachname()+" bekommt "+klaus.entgeltBerechnen()+" moantlich und "+klaus.entgeltBerechnen()*12+" jaehrlich");
	}
}
