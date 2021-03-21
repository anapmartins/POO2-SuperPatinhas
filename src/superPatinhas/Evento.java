package superPatinhas;

import superPatinhas.observer.AdocaoObserver;
import superPatinhas.observer.Notificacao;
import superPatinhas.observer.Observable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Evento implements AdocaoObserver {

    private Date data;
    private String local;
    private String descricao;

    public Evento() {
        this.data = new Date();
        this.local = "";
        this.descricao = "";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        this.descricao = descricao;
    }

    public void criaEvento(Date data, String local, String descricao){

        setData(data);
        setLocal(local);
        setDescricao(descricao);
    }

    @Override
    public void update(Observable observable) {

        Notificacao notifica = (Notificacao) observable;

        if(!notifica.getMensagem().equals("")) {
            System.out.println(notifica.getMensagem());
            System.out.println("Local: " + local);
            System.out.println("Data: " + new SimpleDateFormat("dd/MM/yyyy").format(data));
        }
        else {
            System.out.println("Sem mensagens novas!");
        }
    }
}

