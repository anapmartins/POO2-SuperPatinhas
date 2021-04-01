package superPatinhas;

import superPatinhas.DAOs.Entity;

public class Patrocinador  extends Entity {
	
	public enum TiposPatrocinador {
        CPF, CNPJ
    }

    private TiposPatrocinador tipo;
    private String nome;
    private String cpf;
    private String cnpj;

    public TiposPatrocinador getTipoPatrocinador() {
        return tipo;
    }

    public void setTipoPatrocinador(TiposPatrocinador tipo) {
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

    public Patrocinador(String nome, String cpf, String cnpj)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }
}
