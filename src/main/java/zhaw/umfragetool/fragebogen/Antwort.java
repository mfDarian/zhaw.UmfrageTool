package zhaw.umfragetool.fragebogen;

public class Antwort {
	
	private Frage frage;
	private int punkteWennGewaehlt;
	private int punkteWennNichtGewaehlt;

	protected Antwort(Frage frage) {
		this.frage = frage;
	}
}
