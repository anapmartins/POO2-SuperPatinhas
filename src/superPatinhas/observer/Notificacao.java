package superPatinhas.observer;

public class Notificacao extends Observable {

    private String mensagem;

    public Notificacao(){
        mensagem = "";

    }
    public void setNovaMensagem(String mensagem) {

        this.mensagem = mensagem;
        notifyObserver();

    }

    public String getMensagem() {

        return mensagem;
    }
}