package superPatinhas;

public class Patrocinador {
    private Integer Id = -1;

    private Enums.TiposPatrocinador tipo;
    private String nome;
    private String cpf;
    private String cnpj;

    public Enums.TiposPatrocinador getTipoPatrocinador() {
        return tipo;
    }

    public void setTipoPatrocinador(Enums.TiposPatrocinador tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}




}
