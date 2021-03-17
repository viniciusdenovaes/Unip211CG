
public class Transformacoes {
	
	static public Ponto translada(Ponto p, int tX, int tY) {
		Ponto pRes = new Ponto();
		pRes.x = p.x + tX;
		pRes.y = p.y + tY;
		return pRes;
	}
	
	
	static public Ponto escala(Ponto p, int sX, int sY) {
		int[][] m1 = {{p.x, p.y}};
		int[][] m2 = 
			{{sX,  0},
			 { 0, sY}};
		int[][] res = multiplica(m1, m2);
		return new Ponto(res[0][0], res[0][1]);
	}
	
	static public int[][] multiplica(int[][] m1, int[][] m2) {
		int lin_m1 = m1.length;
		int col_m1 = m1[0].length;
		int lin_m2 = m2.length;
		int col_m2 = m2[0].length;
		int[][] res = new int[lin_m1][col_m2];
		for(int i=0; i<lin_m1; i++) {
			for(int j=0; j<col_m2; j++) {
				int soma = 0;
				for(int k=0; k<col_m1; k++) {
					soma += m1[i][k]*m2[k][j];
				}
				res[i][j] = soma;
			}
		}
		return res;

	}
}
