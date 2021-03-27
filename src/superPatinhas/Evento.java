package superPatinhas;

import java.util.Date;

public class Evento {

    private Date data;
    private Endereco local;
    private String descricao;

    public Evento() {
        this.data = new Date();
        this.local = new Endereco();
        this.descricao = "";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Endereco getLocal() {
        return local;
    }

    public void setLocal(Endereco local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void criaEvento(Date data, Endereco local, String descricao){

        setData(data);
        setLocal(local);
        setDescricao(descricao);
    }

}
