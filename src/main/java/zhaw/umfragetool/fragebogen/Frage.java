package zhaw.umfragetool.fragebogen;

import java.util.ArrayList;

public abstract class Frage {
	
	private Fragebogen fragebogen;
	private ArrayList<Antwort> antworten;
	private int minimalAnzahlAntworten = 0;
	private int maximalAnzahlAntworten;
	private boolean beantwortungsPflichtig;
	
	protected Frage(Fragebogen fragebogen, boolean beantwortungsPflichtig) {
		this.fragebogen = fragebogen;
		this.beantwortungsPflichtig = beantwortungsPflichtig;
	}
	
	protected void antwortEntfernen(Antwort antwort) {
		
	}
	
	public int getMininumAnzahlAntworten() {
		return minimalAnzahlAntworten;
	}
	
	protected void setMinimalAnzahlAntworten(int minimum) {
		this.minimalAnzahlAntworten = minimum;
	}
	
	public int getMaximumAnzahlAntworten() {
		return maximalAnzahlAntworten;
	}
	
	protected void setMaximalAnzahlAntworten(int maximum) {
		this.maximalAnzahlAntworten = maximum;
	}
	
	public boolean getBeantwortungspflichtig() {
		return beantwortungsPflichtig;
	}
	
	protected void setBeantwortungsPflichtig(boolean beantwortungsPflichtig) {
		this.beantwortungsPflichtig = beantwortungsPflichtig;
	}

}
