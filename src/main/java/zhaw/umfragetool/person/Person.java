package zhaw.umfragetool.person;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

}
