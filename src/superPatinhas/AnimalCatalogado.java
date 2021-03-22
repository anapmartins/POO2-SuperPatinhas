
package superPatinhas;

/**
 *
 * @author carol
 */
public class AnimalCatalogado {

    private Integer Id = -1;
    private String descricoesFisicas;
    private Integer foto;
    private String nome;
    private Integer vacinasTomadas;
    private Integer idade;
    private AnimalAdocao adocao;
    private AnimalPerdido perdido;

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}


    public AnimalAdocao getAdocao() {
        return adocao;
    }

    public void setAdocao(AnimalAdocao adocao) {
        this.adocao = adocao;
    }

    public AnimalPerdido getPerdido() {
        return perdido;
    }

    public void setPerdido(AnimalPerdido perdido) {
        this.perdido = perdido;
    }

    public String getDescricoesFisicas() {
        return descricoesFisicas;
    }

    public void setDescricoesFisicas(String descricoesFisicas) {
        this.descricoesFisicas = descricoesFisicas;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVacinasTomadas() {
        return vacinasTomadas;
    }

    public void setVacinasTomadas(Integer vacinasTomadas) {
        this.vacinasTomadas = vacinasTomadas;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public AnimalCatalogado(String descricoesFisicas,
                            Integer foto,
                            String nome,
                            Integer vacinasTomadas,
                            Integer idade,
                            AnimalAdocao adocao,
                            AnimalPerdido perdido) {
        this.descricoesFisicas = descricoesFisicas;
        this.foto = foto;
        this.nome = nome;
        this.vacinasTomadas = vacinasTomadas;
        this.idade = idade;
        this.adocao = adocao;
        this.perdido = perdido;
    }
   
}
