package zhaw.umfragetool.person;

public class Person {
	
	public static final String ANONYM = "anonyme Person";
	private Person anonymePerson;
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	protected Person getAnonymePerson() {
		if(anonymePerson == null) {
			anonymePerson = new Person(ANONYM);
		}
		return anonymePerson;
	}
	
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

}
