package superPatinhas;

import java.util.Date;

public class Evento {
    private Integer Id = -1;
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

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

    public Evento(Date data, Endereco local, String descricao) {
        this.data = data;
        this.local = local;
        this.descricao = descricao;
    }
}
