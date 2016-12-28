package zhaw.umfragetool.fragebogen;

import java.io.Serializable;
import java.util.ArrayList;

public class Fragebogen implements Serializable{
	
	private String name;
	private ArrayList<Frage> fragen;
	
	public Fragebogen(String name) {
		this.name = name;
		fragen = new ArrayList<Frage>();
	}
	
	public void frageEntfernen(Frage frage) {
		if (fragen.contains(frage)) {
			fragen.remove(frage);
		}
	}
	
	public void frageEinfuegen (Frage frage) {
		fragen.add(frage);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printAllTest() {
		for (Frage frage : fragen) {
			System.out.println(frage.getText());
			for (Antwort antwort : frage.getAntworten()) {
				System.out.println(antwort.getText());
			}
		}
	}
	
}
