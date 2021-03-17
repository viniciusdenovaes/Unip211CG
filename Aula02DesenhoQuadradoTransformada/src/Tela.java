import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class Tela extends JPanel {
	
	int lado = 200;
	
	Ponto pInicial;
	Ponto[] ps = new Ponto[4];
	
	int tX = 0;
	int tY = 0;
	
	int sX = 1;
	int sY = 1;
	
	public Tela(int aX0, int aY0) {
		pInicial = new Ponto(aX0, aY0);
		for(int i=0; i<ps.length; i++) {
			ps[i] = new Ponto();
		}
		inicializaQuadrado();
	}
	
	void inicializaQuadrado() {
		ps[0].x = pInicial.x;
		ps[0].y = pInicial.y;
		
		ps[1].x = ps[0].x+lado;
		ps[1].y = ps[0].y;
		
		ps[2].x = ps[1].x;
		ps[2].y = ps[1].y+lado;
		
		ps[3].x = ps[0].x;
		ps[3].y = ps[0].y+lado;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		inicializaQuadrado();
		fazTranslacao();
		fazEscala();
		
		this.setBackground(new Color(230, 230, 230));
		
		g2d.setStroke(new BasicStroke(15));
		
		g2d.setColor(Color.RED);
		g2d.drawLine(ps[0].x, ps[0].y, ps[1].x, ps[1].y);
		
		g2d.setColor(Color.GREEN);
		g2d.drawLine(ps[1].x, ps[1].y, ps[2].x, ps[2].y);
		
		g2d.setColor(Color.BLUE);
		g2d.drawLine(ps[2].x, ps[2].y, ps[3].x, ps[3].y);
		
		g2d.setColor(Color.BLACK);
		g2d.drawLine(ps[3].x, ps[3].y, ps[0].x, ps[0].y);
	}
	
	public void atualizaTranslacao(int aTX, int aTY) {
		tX = aTX;
		tY = aTY;
		repaint();
	}
	
	public void fazTranslacao() {
		for(int i=0; i<ps.length; i++) {
			ps[i] = Transformacoes.translada(ps[i], tX, tY);
		}
	}

	public void atualizaEscala(int aSX, int aSY) {
		sX = aSX;
		sY = aSY;
		repaint();
	}
	
	public void fazEscala() {
		
		for(int i=0; i<ps.length; i++) {
			ps[i] = Transformacoes.escala(ps[i], sX, sY);
		}
	}

}
