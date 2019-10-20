package de.hhn.se.gs2.mitarbeitern.model;

public interface IMitarbeiter {
	
	public final float mindestLohn = 9.19f;

	public enum Vertragsart{
		UNBEFRIESTETER,
		BEFRIESTETER,
		TEILZEIT
	}
	
	public abstract float entgeltBerechnen();
}
