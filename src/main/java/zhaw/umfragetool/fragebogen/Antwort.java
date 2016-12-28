package zhaw.umfragetool.fragebogen;

import java.io.Serializable;

public class Antwort implements Serializable{
	
	private String text;
	private Frage frage;
	private int punkteWennGewaehlt;
	private int punkteWennNichtGewaehlt;

	public Antwort(Frage frage, String text) {
		this.frage = frage;
		this.text = text;
		frage.antwortEinfuegen(this);
	}

	public final String getText() {
		return text;
	}

	public final void setText(String text) {
		this.text = text;
	}

	public final Frage getFrage() {
		return frage;
	}

	public final void setFrage(Frage frage) {
		this.frage = frage;
	}

	public final int getPunkteWennGewaehlt() {
		return punkteWennGewaehlt;
	}

	public final void setPunkteWennGewaehlt(int punkteWennGewaehlt) {
		this.punkteWennGewaehlt = punkteWennGewaehlt;
	}

	public final int getPunkteWennNichtGewaehlt() {
		return punkteWennNichtGewaehlt;
	}

	public final void setPunkteWennNichtGewaehlt(int punkteWennNichtGewaehlt) {
		this.punkteWennNichtGewaehlt = punkteWennNichtGewaehlt;
	}
	
	
}
