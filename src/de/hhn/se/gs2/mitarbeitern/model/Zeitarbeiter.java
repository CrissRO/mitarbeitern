package de.hhn.se.gs2.mitarbeitern.model;

public class Zeitarbeiter extends Mitarbeiter {

	private float stundenLohn = 4.7f;
	private int gearbeiteteStunden;
	
	public Zeitarbeiter(String vorname, String nachname, float stundenLohn) {
		super(vorname, nachname);
		this.stundenLohn = stundenLohn;
	}

	@Override
	public float entgeltBerechnen() {
		return stundenLohn * gearbeiteteStunden;
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
}
