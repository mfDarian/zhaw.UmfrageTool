package zhaw.umfragetool.umfrage;

public class UmfrageEditor {
	
	private static UmfrageEditor editor;
	private Umfrage umfrage;
	
	private UmfrageEditor() {
		
	}
	
	public UmfrageEditor getEditor() {
		if (editor == null) {
			editor = new UmfrageEditor();
		}
		return editor;
	}

}