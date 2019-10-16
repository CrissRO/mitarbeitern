package de.hhn.se.gs2.mitarbeitern.model;

/**
 * 
 * @author tbirghisan
 * 
 * */

public abstract class Mitarbeiter {

	protected String vorname;
	protected String nachname;
	protected float jahresGehaltBisHeute;
	
	public Mitarbeiter(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		jahresGehaltBisHeute = 0;
	}
	
	public abstract float entgeltBerechnen();

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

	public float getJahresGehaltBisHeute() {
		return jahresGehaltBisHeute;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [vorname=" + vorname + ", nachname=" + nachname + "]";
	}
	
	
}
