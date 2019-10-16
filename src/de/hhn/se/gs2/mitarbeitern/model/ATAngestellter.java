package de.hhn.se.gs2.mitarbeitern.model;

/**
 * @author tbirghis
 * 
 * */

public class ATAngestellter extends Mitarbeiter {

	private float monatsLohn;
	
	public ATAngestellter(String vorname, String nachname, float monatsLohn) {
		super(vorname, nachname);
		this.monatsLohn = monatsLohn;
	}

	@Override
	public float entgeltBerechnen() {
		return monatsLohn;
	}
	
	public float getMonatsLohn() {
		return monatsLohn;
	}

}
