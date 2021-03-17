import javax.swing.SwingUtilities;

public class Teste {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}
	
	
	public static void createAndShowGUI() {
		new Janela();
	}

}
