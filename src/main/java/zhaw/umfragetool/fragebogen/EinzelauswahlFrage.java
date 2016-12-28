package zhaw.umfragetool.fragebogen;

public class EinzelauswahlFrage extends Frage {

	public EinzelauswahlFrage(Fragebogen fragebogen, String text) {
		super(text, fragebogen, true);
		this.setMinimalAnzahlAntworten(1);
		this.setMaximalAnzahlAntworten(1);
	}
	
	public EinzelauswahlFrage(Fragebogen fragebogen, String text, boolean beantwortungsPflichtig) {
		super(text, fragebogen, beantwortungsPflichtig);
		if (beantwortungsPflichtig) {
			this.setMinimalAnzahlAntworten(1);
		}
		this.setMaximalAnzahlAntworten(1);
	}

}
