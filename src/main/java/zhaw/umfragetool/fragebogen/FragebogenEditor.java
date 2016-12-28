package zhaw.umfragetool.fragebogen;

public class FragebogenEditor {
	
	private static FragebogenEditor editor;
	private Fragebogen fragebogen;
	
	private FragebogenEditor() {
		fragebogen = new Fragebogen("Neuer Fragebogen");
	}
	
	public static FragebogenEditor getEditor() {
		if (editor == null) {
			editor = new FragebogenEditor();
		}
		return editor;
	}
	
	private void setFragebogen(Fragebogen fragebogen) {
		this.fragebogen = fragebogen;
	}
	
	public void setFragebogenName(String name) {
		fragebogen.setName(name);
	}
	
	public Fragebogen getFragebogen() {
		return fragebogen;
	}
	
//	public void einzelauswahlFrageEinfuegen (String text) {
//		fragebogen.einzelauswahlFrageEinfuegen(text);
//	}

}
