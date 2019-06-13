package factory;

import java.util.Random;

public class CasaCarta implements Casa {
	int posicaoCarta;
	Random valor = new Random();


	public CasaCarta(int posicaoCarta) {
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
		while (numero == 0) {
			numero = valor.nextInt(7) - 3;

		}
		System.out.println(numero);
		return numero;

	}

	@Override
	public String getDescricao() {
		return "voce caiu em uma casa que possui carta sua nova posicao é: ";
	}
//	}

}
