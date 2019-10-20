package de.hhn.se.gs2.mitarbeitern.model;

/**
 * 
 * @author fbertea
 * */

public interface IMitarbeiter {
	
	public final float mindestLohn = 9.19f;

	public enum Vertragsart{
		UNBEFRIESTETER,
		BEFRIESTETER,
		TEILZEIT
	}
	
	public abstract float entgeltBerechnen();
}
