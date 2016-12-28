package zhaw.umfragetool.fragebogen;

public class MehrfachauswahlFrage extends Frage {

	public MehrfachauswahlFrage(String text, Fragebogen fragebogen) {
		super(text, fragebogen, true);
	}
	
	public MehrfachauswahlFrage(String text, Fragebogen fragebogen, boolean beantwortungsPflichtig) {
		super(text, fragebogen, beantwortungsPflichtig);
		if (beantwortungsPflichtig) {
			this.setMinimalAnzahlAntworten(1);
		}
	}

}
