package de.hhn.se.gs2.mitarbeitern.model;
/**
 * 
 * @author cmocanu und fbertea
 * 
 * */

public class Main {

	private static Angestellter cezar;
	private static ATAngestellter teo;
	private static Zeitarbeiter fabian;
	
	public static void main(String args[]) {
		
		try {
			cezar = new Angestellter("Cezar", "Mocanu", 326.2f,IMitarbeiter.Vertragsart.BEFRIESTETER);
			fabian = new Zeitarbeiter("Fabian", "Bertea",9.7f,IMitarbeiter.Vertragsart.TEILZEIT);
			teo = new ATAngestellter("Teodor", "Birghisan", 2500,IMitarbeiter.Vertragsart.UNBEFRIESTETER);
			
			cezar.setGearbeiteteUeberstunden(23);
			fabian.setGearbeiteStunden(123);
			
			cezar.setJahresgehaltBisHeute(cezar.getJahresgehaltBisHeute() + cezar.entgeltBerechnen());
			fabian.setJahresgehaltBisHeute(fabian.getJahresgehaltBisHeute() + fabian.entgeltBerechnen());
			teo.setJahresgehaltBisHeute(teo.getJahresgehaltBisHeute() + teo.entgeltBerechnen());
			
			System.out.println(cezar + " tatsaechliche Steuer " + cezar.tatsaechlicheEinkommentSteuer() + " voraussichtliche Steuer " + cezar.voraussichtlicheEinkommentSteuer());
			System.out.println(teo + " tatsaechliche Steuer " + teo.tatsaechlicheEinkommentSteuer() + " voraussichtliche Steuer " + teo.voraussichtlicheEinkommentSteuer());
			System.out.println(fabian + " tatsaechliche Steuer " + fabian.tatsaechlicheEinkommentSteuer() + " voraussichtliche Steuer " + fabian.voraussichtlicheEinkommentSteuer());
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
