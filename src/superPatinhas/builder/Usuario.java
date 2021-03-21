package superPatinhas.builder;

import superPatinhas.observer.AdocaoObserver;
import superPatinhas.observer.Observable;

public class Usuario implements AdocaoObserver {

    private String nome;

    private String endereco;

    private String telefone;

    private String email;

    private String senha;

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario(String nome, String endereco, String telefone, String email, String senha, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }


    @Override
    public void update(Observable observable) {

        Notificacao notifica = (Noficacao) observable;

        if(!notifica.getMensagem().equals("")) {
            System.out.println(email.toString() + ": " + caixa.getMensagem());
        }
        else {
            System.out.println(email.toString() + ": Sem mensagens novas!");
        }
    }
}
