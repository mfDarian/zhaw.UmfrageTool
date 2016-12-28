package zhaw.umfragetool.test;

import zhaw.umfragetool.fragebogen.*;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Start Test");

		Fragebogen fragebogen = new Fragebogen("Umfrage zur US Wahl");
		Frage f1 = new EinzelauswahlFrage(fragebogen, "Zufrieden?");
		Antwort a1 = new Antwort(f1, "ja");
		Antwort a2 = new Antwort(f1, "nein");

		
		fragebogen.printAllTest();
		System.out.println("Ende Test");
	}
}
