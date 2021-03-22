package superPatinhas;

import java.util.Date;

public class Evento {
    private Integer Id = -1;

    private Date data;
    private String local;
    private String descricao;

    public Evento(Date data, String local, String descricao) {
        this.data = data;
        this.local = local;
        this.descricao = descricao;
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

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

    /*public void criaEvento(Date data, String local, String descricao){

        setData(data);
        setLocal(local);
        setDescricao(descricao);
    }*/

}
