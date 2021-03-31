package view;

import javax.swing.event.ChangeListener;

import entity.Desenho;
import entity.Ponto;

public class View {
	
	Janela janela;
	
	public View(Desenho desenho) {
		janela = new Janela(desenho);
	}
	
	public void atualiza(Desenho desenho) {
		janela.atualiza(desenho);
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		janela.adicionaListenerSlide(cl);
	}
	
	public Ponto getValorT() {
		return janela.getValorSlideT();
	}

	public Ponto getValorS() {
		return janela.getValorSlideS();
	}

	public double getValorR() {
		return janela.getValorSlideR();
	}

}
