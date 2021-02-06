
package projetosuperpatinhas;

/**
 *
 * @author carol
 */
public class AnimalCatalogado {
    
    private String descricoesFisicas;
    private Integer foto;
    private String nome;
    private Integer vacinasTomadas;
    private Integer idade;

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

    public AnimalCatalogado(String descricoesFisicas, Integer foto, String nome, Integer vacinasTomadas, Integer idade) {
        this.descricoesFisicas = descricoesFisicas;
        this.foto = foto;
        this.nome = nome;
        this.vacinasTomadas = vacinasTomadas;
        this.idade = idade;
    }
 
}
