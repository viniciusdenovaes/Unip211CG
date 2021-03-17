import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Janela extends JFrame {
	
	Tela tela = new Tela(250, 250);
	Botoes botoes = new Botoes();
	
	public Janela() {
		super("janela da primeira aula");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		tela.setPreferredSize(new Dimension(620, 620));
		
		add(tela, BorderLayout.CENTER);
		add(botoes, BorderLayout.LINE_END);
		
		botoes.adicionaListenerSlideT(new Translacao());
		botoes.adicionaListenerSlideS(new Escala());
		
		
		setVisible(true);
		pack();
		
	}
	
	class Translacao implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int tX = botoes.getValorSlideTX();
			int tY = botoes.getValorSlideTY();
			
			tela.atualizaTranslacao(tX, tY);
		}
	}

	class Escala implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int sX = botoes.getValorSlideSX();
			int sY = botoes.getValorSlideSY();
			
			tela.atualizaEscala(sX, sY);
		}
	}

}
