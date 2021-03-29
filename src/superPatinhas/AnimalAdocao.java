
package superPatinhas;

/**
 *
 * @author carol
 */
public class AnimalAdocao{
    private Integer Id = -1;
    private String linkRedeSocial;
    private String adotadoAnteriormente;
    private String ongPerternce;
    private String porte;

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

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
    
    public void setPorte(String porte) {
    	this.porte = porte;
    }
    
    public String getPorte() {
    	return porte;
    }
    public AnimalAdocao(String linkRedeSocial, String adotadoAnteriormente, String ongPerternce, String porte) {
        this.linkRedeSocial = linkRedeSocial;
        this.adotadoAnteriormente = adotadoAnteriormente;
        this.ongPerternce = ongPerternce;
        this.porte = porte;
    }
}
