package superPatinhas.chain;

import superPatinhas.AnimalAdocao;
import superPatinhas.Usuario;

public interface AdocaoHandler {
	public void setNextHandler(AdocaoHandler handler);
	public void processaHandler(AnimalAdocao animal, Usuario usuario);

}
