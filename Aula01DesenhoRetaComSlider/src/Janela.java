import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Janela extends JFrame {
	
	Tela tela = new Tela();
	Botoes botoes = new Botoes();
	
	public Janela() {
		super("janela da primeira aula");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		tela.setPreferredSize(new Dimension(620, 620));
		
		add(tela, BorderLayout.CENTER);
		add(botoes, BorderLayout.LINE_END);
		
		botoes.adicionaChangeListenerNoSlide(new MudaReta());
		
		
		setVisible(true);
		pack();
		
	}
	
	class MudaReta implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int valor = botoes.getValorSlide();
			
			System.out.println("slide mudado, valor: " + valor);
			
			tela.atualizaValor(valor);
		}
	}

}
