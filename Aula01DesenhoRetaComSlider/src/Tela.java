import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class Tela extends JPanel {
	
	int x0 = 10;
	int y0 = 10;
	int x1 = 120;
	int y1 = 220;
	
	int value = 0;
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		this.setBackground(Color.CYAN);
		
		g2d.setColor(Color.MAGENTA);
		g2d.setStroke(new BasicStroke(10));
		
		x0 = 10;
		y0 = 10;
		x1 = 120;
		y1 = 220;
		
		x0 += value;
		x1 += value;
		
		g2d.drawLine(x0, y0, x1, y1);
	}
	
	public void atualizaValor(int novoValor) {
		this.value = novoValor;
		this.repaint();
	}

}
