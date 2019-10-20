package de.hhn.se.gs2.mitarbeitern.model;

import de.hhn.se.gs2.mitarbeitern.model.IMitarbeiter.Vertragsart;

/**
 * 
 * @author cmocanu
 * 
 * 
 */

public class Zeitarbeiter implements IMitarbeiter,ISteuerZahler {

	private float stundenLohn;
	private int gearbeiteteStunden;
	
	private String vorname,nachname;
	private float jahresgehaltBisHeute;
	private Vertragsart vertragsArt;
	
	public Zeitarbeiter(String vorname, String nachname, float stundenLohn,Vertragsart vertragsArt) throws Exception{
		this.vorname = vorname;
		this.nachname = nachname;
		this.jahresgehaltBisHeute = 0;
		this.vertragsArt = vertragsArt;
		
		if(stundenLohn < IMitarbeiter.mindestLohn) 
			throw new Exception("Stundenlohn weniger als mindest Lohn!");
		
		this.stundenLohn = stundenLohn;
	}

	@Override
	public float entgeltBerechnen() {
		return stundenLohn * gearbeiteteStunden;
	}
	
	@Override
	public float tatsaechlicheEinkommentSteuer() {
		
		if(entgeltBerechnen() < ISteuerZahler.grundFreiBetrag)
			return 0;
		return 0.16f * entgeltBerechnen();
	}

	@Override
	public float voraussichtlicheEinkommentSteuer() {
		return tatsaechlicheEinkommentSteuer() * 12;
	}
	
	public int getGearbeiteStunden() {
		return gearbeiteteStunden;
	}

	public void setGearbeiteStunden(int gearbeiteStunden) {
		this.gearbeiteteStunden = gearbeiteStunden;
	}

	public float getStundenLohn() {
		return stundenLohn;
	}

	
	public int getGearbeiteteStunden() {
		return gearbeiteteStunden;
	}

	public void setGearbeiteteStunden(int gearbeiteteStunden) {
		this.gearbeiteteStunden = gearbeiteteStunden;
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

	public void setStundenLohn(float stundenLohn) {
		this.stundenLohn = stundenLohn;
	}

	@Override
	public String toString() {
		return "Zeitarbeiter [stundenLohn=" + stundenLohn + ", gearbeiteteStunden=" + gearbeiteteStunden + ", vorname="
				+ vorname + ", nachname=" + nachname + ", jahresgehaltBisHeute=" + jahresgehaltBisHeute
				+ ", vertragsArt=" + vertragsArt + "]";
	}

	

}
