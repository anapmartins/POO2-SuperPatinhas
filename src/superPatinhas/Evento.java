package superPatinhas;

import java.util.Date;

public class Evento {

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

}
