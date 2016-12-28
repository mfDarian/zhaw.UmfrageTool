package zhaw.umfragetool.fragebogen;

public class FragebogenEditor {
	
	private static FragebogenEditor editor;
	private Fragebogen fragebogen;
	
	private FragebogenEditor() {
		
	}
	
	public FragebogenEditor getEditor() {
		if (editor == null) {
			editor = new FragebogenEditor();
		}
		return editor;
	}

}
