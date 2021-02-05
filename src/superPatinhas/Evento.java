package superPatinhas;

import java.util.Date;

public class Evento {

    private Date data;

    private String local;

    private String descricao;

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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Evento(Date data, String local, String descricao) {
        this.data = data;
        this.local = local;
        this.descricao = descricao;
    }
}
