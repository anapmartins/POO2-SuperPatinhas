package superPatinhas;

public class Ong {
    private Integer Id = -1;

    private String nome;
    private String cnpj;
    private Endereco endereco;
    private Integer quantidadePets;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getQuantidadePets() {
        return quantidadePets;
    }

    public void setQuantidadePets(Integer quantidadePets) {
        this.quantidadePets = quantidadePets;
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

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

    public Ong(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;


    }
}
