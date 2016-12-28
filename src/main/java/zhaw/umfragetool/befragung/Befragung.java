/**
 * 
 */
package zhaw.umfragetool.befragung;

import zhaw.umfragetool.umfrage.Umfrage;
import zhaw.umfragetool.person.*;

/**
 * @author Darian
 *
 */
public class Befragung {
	
	private Umfrage umfrage;
	private Person befragter;
	private Anwender befrager;
	
	public Befragung(Umfrage umfrage, Person befragter, Anwender befrager) {
		this.umfrage = umfrage;
		this.befragter = befragter;
		this.befrager = befrager;
	}

}
