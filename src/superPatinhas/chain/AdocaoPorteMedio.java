package superPatinhas.chain;

import superPatinhas.AnimalAdocao;
import superPatinhas.Usuario;

public class AdocaoPorteMedio implements AdocaoHandler {
	private AdocaoHandler nextHandler;
	
	public void setNextHandler(AdocaoHandler handler) {
		nextHandler = handler;
	}
	
	public void processaHandler(AnimalAdocao animal, Usuario usuario) {
		if (usuario.getIdade() < 60 && usuario.getEndereco().getComplemento() == "Apartamento" && animal.getPorte() == "M�dio"){
			System.out.println("Animal dispon�vel para ado��o.");		
		}
		else {
			nextHandler.processaHandler(animal, usuario);
		}
	}

}
