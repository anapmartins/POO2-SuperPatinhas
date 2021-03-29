
package superPatinhas;

public class AnimalPerdido{
    private Integer Id = -1;
    
    private String localVisto;

    public Integer getId() {return Id;}

    public void setId(Integer id) {this.Id = id;}

    public String getLocalVisto() {
        return localVisto;
    }

    public void setLocalVisto(String localVisto) {
        this.localVisto = localVisto;
    }

    public AnimalPerdido(String localVisto) {
        this.localVisto = localVisto;
    }

   
    }
   