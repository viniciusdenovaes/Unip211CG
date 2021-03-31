package view;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import entity.Desenho;
import entity.Ponto;

public class Janela extends JFrame {
	
	Tela tela;
	Botoes botoes = new Botoes();
	
	public Janela(Desenho desenho) {
		super("janela da primeira aula");
		
		tela = new Tela(desenho);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		tela.setPreferredSize(new Dimension(620, 620));
		
		add(tela, BorderLayout.CENTER);
		add(botoes, BorderLayout.LINE_END);
		
		setVisible(true);
		pack();
		
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		botoes.adicionaListenerSlide(cl);
	}
	
	public void atualiza(Desenho desenho) {
		tela.atualiza(desenho);
	}
	
	public Ponto getValorSlideT() {
		return new Ponto(
				botoes.getValorSlideTX(), 
				botoes.getValorSlideTY());
	}
	
	public Ponto getValorSlideS() {
		return new Ponto(
				botoes.getValorSlideSX(), 
				botoes.getValorSlideSY());
	}

	public double getValorSlideR() {
		return botoes.getValorSlideR();
	}

	
}
