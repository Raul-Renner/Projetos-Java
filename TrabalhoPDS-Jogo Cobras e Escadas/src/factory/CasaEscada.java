package factory;

public class CasaEscada implements Casa{
 private int posicaoTopoEscada;
 private int posicaoBaixoEscada;
public CasaEscada(int posicaoBaixoEscada, int posicaoEscadaTopoEscada) {
	this.posicaoBaixoEscada = posicaoBaixoEscada;
	this.posicaoTopoEscada = posicaoEscadaTopoEscada;
}
public int getPosicaoTopoEscada() {
	return posicaoTopoEscada;
}
public int getPosicaoBaixoEscada() {
	return posicaoBaixoEscada;
}
@Override
public int mover() {
	// TODO Auto-generated method stub
	return posicaoTopoEscada;
}
@Override
public int getPosicao() {
	// TODO Auto-generated method stub
	return posicaoBaixoEscada;
}




 
}
