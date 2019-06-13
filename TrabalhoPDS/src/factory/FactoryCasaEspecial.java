package factory;

public class FactoryCasaEspecial {
	
	public Casa getCasaEspecial(String descricao, int posicao,int posicaoFinal) {
		if(descricao.equals("casa cobra")) {
			return new CasaCobra(posicao,posicaoFinal);
			
		}else if(descricao.equals("casa escada")){
			return new CasaEscada(posicao,posicaoFinal);
			
		}else if(descricao.equals("casa carta")){
			return new CasaCarta(posicao);
		}else {
			return null;
		}
			
		}
	}

