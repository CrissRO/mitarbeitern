package de.hhn.se.gs2.mitarbeitern.model;

public interface ISteuerZahler {

	public final float grundFreiBetrag = 250.0f;
	
	public float tatsaechlicheEinkommentSteuer();
	public float voraussichtlicheEinkommentSteuer();
}
