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
	
	public void adicionaListenerSlideT(ChangeListener cl) {
		sliderTX.addChangeListener(cl);
		sliderTY.addChangeListener(cl);
	}
	
	public void adicionaListenerSlideS(ChangeListener cl) {
		sliderSX.addChangeListener(cl);
		sliderSY.addChangeListener(cl);
	}
	
	
	

}
