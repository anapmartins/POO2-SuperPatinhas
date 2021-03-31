package superPatinhas;

public class AdocaoPorteMedio implements AdocaoHandler {
	private AdocaoHandler nextHandler;
	
	public void setNextHandler(AdocaoHandler handler) {
		nextHandler = handler;
	}
	
	public void processaHandler(AnimalAdocao animal, Usuario usuario) {
		if (usuario.getIdade() < 60 && usuario.getEndereco().getComplemento() == "Apartamento" && animal.getPorte() == "Médio"){
			System.out.println("Animal disponível para adoção.");		
		}
		else {
			nextHandler.processaHandler(animal, usuario);
		}
	}

}
