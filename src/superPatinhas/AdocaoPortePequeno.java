package superPatinhas;

public class AdocaoPortePequeno implements AdocaoHandler {
	private AdocaoHandler nextHandler;
	
	public void setNextHandler(AdocaoHandler handler) {
		nextHandler = handler;
	}
	
	public void processaHandler(AnimalAdocao animal, Usuario usuario) {
		if (usuario.getIdade() >= 60 && animal.getPorte() == "Pequeno"){
			System.out.println("Animal disponível para adoção.");		
		}
		else {
			nextHandler.processaHandler(animal, usuario);
		}
	}

}
