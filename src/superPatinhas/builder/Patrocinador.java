package superPatinhas.builder;

public class Patrocinador {

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




}
