package entity;

import java.util.ArrayList;
import java.util.List;

import model.Transformacoes;

public class Desenho {
	
	List<Ponto> pontosInicial;
	List<Ponto> pontos;
	
	public Desenho(List<Ponto> pontosIniciais) {
		this.pontosInicial = pontosIniciais;
	}
	
	public void reset() {
		pontos = new ArrayList<>(pontosInicial);
	}
	
	public List<Ponto> getPontos(){
		return pontos;
	}
	
	public Ponto getPontoCentral() {
		Ponto pontoMedio = new Ponto(0, 0);
		for(Ponto p: pontos) {
			pontoMedio.x += p.x;
			pontoMedio.y += p.y;
		}
		pontoMedio.x /= pontos.size();
		pontoMedio.y /= pontos.size();
		
		return pontoMedio;
	}
	
	public void makeTransladar(double tX, double tY) {
		List<Ponto> pontosResultantes = new ArrayList<>();
		for(Ponto p: pontos) {
			Ponto novoPonto = new Ponto(p.x+tX, p.y+tY);
			pontosResultantes.add(novoPonto);
		}
		this.pontos = pontosResultantes;
	}
	
	public void makeRotacao(double a) {
		List<Ponto> pontosResultantes = new ArrayList<>();
		Ponto pontoCentral = getPontoCentral();
		for(Ponto p: pontos) {
			Ponto novoPonto = new Ponto(p.x, p.y);
			novoPonto = Transformacoes.translada(novoPonto, -pontoCentral.x, -pontoCentral.y);
			novoPonto = Transformacoes.rotacao(novoPonto, a);
			novoPonto = Transformacoes.translada(novoPonto, pontoCentral.x, pontoCentral.y);
			pontosResultantes.add(novoPonto);
		}
		this.pontos = pontosResultantes;
	}
	
	

}
