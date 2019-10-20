package de.hhn.se.gs2.mitarbeitern.model;

/**
 * @author tbirghis
 * 
 * */

public class ATAngestellter implements IMitarbeiter,ISteuerZahler{

	private float monatsLohn;
	
	private String vorname,nachname;
	private float jahresgehaltBisHeute;
	private Vertragsart vertragsArt;
	
	public ATAngestellter(String vorname, String nachname, float monatsLohn,Vertragsart vertragsArt) throws Exception {
		this.vorname = vorname;
		this.nachname = nachname;
		this.jahresgehaltBisHeute = 0;
		this.vertragsArt = vertragsArt;
		
		if(monatsLohn / 4 * 40 < IMitarbeiter.mindestLohn) 
			throw new Exception("Stundenlohn weniger als mindest Lohn!");
		
		this.monatsLohn = monatsLohn;
	}

	@Override
	public float entgeltBerechnen() {
		return monatsLohn;
	}
	
	@Override
	public float tatsaechlicheEinkommentSteuer() {
		if(monatsLohn < ISteuerZahler.grundFreiBetrag)
			return 0;
		return 0.16f * (monatsLohn - ISteuerZahler.grundFreiBetrag);
	}

	@Override
	public float voraussichtlicheEinkommentSteuer() {
		return tatsaechlicheEinkommentSteuer() * 12;
	}
	
	public float getMonatsLohn() {
		return monatsLohn;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public float getJahresgehaltBisHeute() {
		return jahresgehaltBisHeute;
	}

	public void setJahresgehaltBisHeute(float jahresgehaltBisHeute) {
		this.jahresgehaltBisHeute = jahresgehaltBisHeute;
	}

	public Vertragsart getVertragsArt() {
		return vertragsArt;
	}

	public void setVertragsArt(Vertragsart vertragsArt) {
		this.vertragsArt = vertragsArt;
	}

	public void setMonatsLohn(float monatsLohn) {
		this.monatsLohn = monatsLohn;
	}

	@Override
	public String toString() {
		return "ATAngestellter [monatsLohn=" + monatsLohn + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", jahresgehaltBisHeute=" + jahresgehaltBisHeute + ", vertragsArt=" + vertragsArt + "]";
	}

	
}
