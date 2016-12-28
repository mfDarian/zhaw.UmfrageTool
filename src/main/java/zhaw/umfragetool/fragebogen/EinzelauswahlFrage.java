package zhaw.umfragetool.fragebogen;

public class EinzelauswahlFrage extends Frage {

	protected EinzelauswahlFrage(Fragebogen fragebogen) {
		super(fragebogen, true);
		this.setMinimalAnzahlAntworten(1);
		this.setMaximalAnzahlAntworten(1);
	}
	
	protected EinzelauswahlFrage(Fragebogen fragebogen, boolean beantwortungsPflichtig) {
		super(fragebogen, beantwortungsPflichtig);
		if (beantwortungsPflichtig) {
			this.setMinimalAnzahlAntworten(1);
		}
		this.setMaximalAnzahlAntworten(1);
	}

}
