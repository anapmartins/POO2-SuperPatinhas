package superPatinhas;

public class AdocaoPorteGrande implements AdocaoHandler {
	private AdocaoHandler nextHandler;
	
	public void setNextHandler(AdocaoHandler handler) {
		nextHandler = handler;
	}
	
	public void processaHandler(AnimalAdocao animal, Usuario usuario) {
		if (usuario.getIdade() < 60 && usuario.getEndereco().getComplemento() == "Casa" && animal.getPorte() == "Grande"){
			System.out.println("Animal disponível para adoção.");		
		}
		else {
			nextHandler.processaHandler(animal, usuario);
		}
	}

}
