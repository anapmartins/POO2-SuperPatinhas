
package projetosuperpatinhas;

/**
 *
 * @author carol
 */
public class AnimalAdocao extends AnimalCatalogado{
    private String linkRedeSocial;
    private String adotadoAnteriormente;
    private String ongPerternce;

    public String getLinkRedeSocial() {
        return linkRedeSocial;
    }

    public void setLinkRedeSocial(String linkRedeSocial) {
        this.linkRedeSocial = linkRedeSocial;
    }

    public String getAdotadoAnteriormente() {
        return adotadoAnteriormente;
    }

    public void setAdotadoAnteriormente(String adotadoAnteriormente) {
        this.adotadoAnteriormente = adotadoAnteriormente;
    }

    public String getOngPerternce() {
        return ongPerternce;
    }

    public void setOngPerternce(String ongPerternce) {
        this.ongPerternce = ongPerternce;
    }

    public AnimalAdocao(String linkRedeSocial, String adotadoAnteriormente, String ongPerternce, String descricoesFisicas, Integer foto, String nome, Integer vacinasTomadas, Integer idade) {
        super(descricoesFisicas, foto, nome, vacinasTomadas, idade);
        this.linkRedeSocial = linkRedeSocial;
        this.adotadoAnteriormente = adotadoAnteriormente;
        this.ongPerternce = ongPerternce;
    }
    

}
