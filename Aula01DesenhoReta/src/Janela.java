import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	Tela tela = new Tela();
	
	public Janela() {
		setSize(420, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		tela.setPreferredSize(new Dimension(620, 620));
		
		add(new Tela(), BorderLayout.CENTER);
		
		
		setVisible(true);
		
	}

}
