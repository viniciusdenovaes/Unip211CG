import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Botoes extends JPanel {
	
	JSlider slider = new JSlider(0, 200, 0);
	
	public Botoes() {
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		add(slider);
	}
	
	public int getValorSlide() {
		return slider.getValue();
	}
	
	public void adicionaChangeListenerNoSlide(ChangeListener cl) {
		this.slider.addChangeListener(cl);
	}
	
	

}
