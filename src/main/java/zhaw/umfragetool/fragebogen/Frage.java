package zhaw.umfragetool.fragebogen;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Frage implements Serializable{
	
	private String text;
	private Fragebogen fragebogen;
	private ArrayList<Antwort> antworten;
	private int minimalAnzahlAntworten = 0;
	private int maximalAnzahlAntworten;
	private boolean beantwortungsPflichtig;
	
	public Frage(String text, Fragebogen fragebogen, boolean beantwortungsPflichtig) {
		this.text = text;
		this.fragebogen = fragebogen;
		this.antworten = new ArrayList<Antwort>();
		this.beantwortungsPflichtig = beantwortungsPflichtig;
		fragebogen.frageEinfuegen(this);
	}
	
	public void antwortEntfernen(Antwort antwort) {
		if (antworten.contains(antwort)) {
			antworten.remove(antwort);
		}
	}
	
	public void antwortEinfuegen(Antwort antwort) {
		antworten.add(antwort);
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public ArrayList<Antwort> getAntworten() {
		return antworten;
	}
	
	public int getMininumAnzahlAntworten() {
		return minimalAnzahlAntworten;
	}
	
	public void setMinimalAnzahlAntworten(int minimum) {
		this.minimalAnzahlAntworten = minimum;
	}
	
	public int getMaximumAnzahlAntworten() {
		return maximalAnzahlAntworten;
	}
	
	public void setMaximalAnzahlAntworten(int maximum) {
		this.maximalAnzahlAntworten = maximum;
	}
	
	public boolean getBeantwortungspflichtig() {
		return beantwortungsPflichtig;
	}
	
	public void setBeantwortungsPflichtig(boolean beantwortungsPflichtig) {
		this.beantwortungsPflichtig = beantwortungsPflichtig;
	}

}
