package superPatinhas;

import superPatinhas.observer.AdocaoObserver;
import superPatinhas.observer.Inscrito;
import superPatinhas.observer.Notificacao;
import superPatinhas.observer.Observable;

public class Usuario implements AdocaoObserver {

    private Endereco endereco;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private String cpf;
    private int idade;
    private Inscrito tipoInscricao;

    public Inscrito getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(Inscrito tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
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
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Usuario(String nome, Endereco endereco, String telefone, String email, String senha, String cpf, int idade, Inscrito tipoInscricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.idade = idade;
        this.tipoInscricao = tipoInscricao;
    }


    @Override
    public void update(Observable observable) {

        Notificacao notifica = (Notificacao) observable;

        if(tipoInscricao != null) {
            switch (tipoInscricao) {
                case EMAIL:
                    if (!notifica.getMensagem().equals("")) {
                        System.out.println(email.toString() + ": " + notifica.getMensagem());
                    } else {
                        System.out.println(email.toString() + ": Sem mensagens novas!");
                    }
                    break;
                case TELEFONE:
                    if (!notifica.getMensagem().equals("")) {
                        System.out.println(telefone.toString() + ": " + notifica.getMensagem());
                    } else {
                        System.out.println(telefone.toString() + ": Sem mensagens novas!");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
