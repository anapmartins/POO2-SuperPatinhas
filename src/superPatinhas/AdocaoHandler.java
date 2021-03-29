package superPatinhas;

public interface AdocaoHandler {
	public void setNextHandler(AdocaoHandler handler);
	public void processaHandler(AnimalAdocao animal, Usuario usuario);

}
