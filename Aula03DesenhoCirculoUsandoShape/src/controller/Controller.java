package controller;

import java.awt.Shape;
import java.awt.geom.Point2D;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;
import view.View;

public class Controller {
	
	View view;
	Model model;
	
	public Controller() {
		model = new Model();
		view = new View(model.getDesenho());
		
		view.adicionaListenerSlide(new MudaSlide());
	}
	
	class MudaSlide implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int quantidadePontos = view.getValorQtd();
			model.updateQuantidade(quantidadePontos);
			
			Point2D.Double t = view.getValorT();
			double a = view.getValorR();
			
			Shape desenho = model.makeTransformacoes(t, a);
			
			view.atualiza(desenho);
			
		}
		
	}
	

}
