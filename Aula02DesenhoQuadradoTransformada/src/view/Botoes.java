package view;
import java.awt.Label;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Botoes extends JPanel {
	
	JSlider sliderTX = new JSlider(-300, 300, 0);
	JSlider sliderTY = new JSlider(-300, 600, 0);
	
	JSlider sliderSX = new JSlider(1, 5, 1);
	JSlider sliderSY = new JSlider(1, 5, 1);
	
	double rFator = 100;
	JSlider sliderR = new JSlider(0, (int)(2*Math.PI*rFator), 0);
	
	public Botoes() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(new Label("Translade em X"));
		add(sliderTX);
		add(new Label("Translade em Y"));
		add(sliderTY);
		add(new Label("Escala em X"));
		add(sliderSX);
		add(new Label("Escala em Y"));
		add(sliderSY);
		add(new Label("Rotacao"));
		add(sliderR);
	}
	
	public int getValorSlideTX() {
		return sliderTX.getValue();
	}
	
	public int getValorSlideTY() {
		return sliderTY.getValue();
	}
	
	public int getValorSlideSX() {
		return sliderSX.getValue();
	}
	
	public int getValorSlideSY() {
		return sliderSY.getValue();
	}
	
	public double getValorSlideR() {
		return (double)sliderR.getValue()/(double)rFator;
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		sliderTX.addChangeListener(cl);
		sliderTY.addChangeListener(cl);
		sliderSX.addChangeListener(cl);
		sliderSY.addChangeListener(cl);
		sliderR.addChangeListener(cl);
	}
	
	
	

}
