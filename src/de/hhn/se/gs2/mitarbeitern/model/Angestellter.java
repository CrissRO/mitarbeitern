package de.hhn.se.gs2.mitarbeitern.model;

public class Angestellter extends Mitarbeiter {

	private float monatsLohn;
	private final float ueberStundenTarif = 5.7f;
	private int gearbeiteteUeberstunden;
	
	public Angestellter(String vorname, String nachname, float monatsLohn) {
		super(vorname, nachname);
		this.monatsLohn = monatsLohn;
	}
	
	@Override
	public float entgeltBerechnen() {
		return (gearbeiteteUeberstunden*ueberStundenTarif)+monatsLohn;	
	}
	
	public int getGearbeiteteUeberstunden() {
		return gearbeiteteUeberstunden;
	}

	public void setGearbeiteteUeberstunden(int gearbeiteteUeberstunden) {
		this.gearbeiteteUeberstunden = gearbeiteteUeberstunden;
	}

	public float getMonatsLohn() {
		return monatsLohn;
	}

	public float getUeberStundenTarif() {
		return ueberStundenTarif;
	}
}
