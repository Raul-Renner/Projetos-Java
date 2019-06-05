package factory;

import java.util.Random;

public class ControladorCarta implements Casa{
	int posicaoCarta;
	
	public ControladorCarta(int posicaoCarta) {
		this.posicaoCarta = posicaoCarta;
	}
	
	@Override
	public int mover() {
		// TODO Auto-generated method stub
		return posicaoCarta += gerarValorCarta();
	}

	@Override
	public int getPosicao() {
		// TODO Auto-generated method stub
		return posicaoCarta;
	}
	
	public int gerarValorCarta() {
	int numero = 0;
	while(numero == 0) {	
		Random valor = new Random();
		numero = valor.nextInt(7) - 3;
		
	}
	System.out.println(numero);
	return numero;

}
//	}

}
