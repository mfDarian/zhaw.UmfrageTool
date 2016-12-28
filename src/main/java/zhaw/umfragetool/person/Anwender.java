package zhaw.umfragetool.person;

public class Anwender extends Person {
	
	private String userId;

	public Anwender(String name, String userId) {
		super(name);
		this.userId = userId;
	}

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
