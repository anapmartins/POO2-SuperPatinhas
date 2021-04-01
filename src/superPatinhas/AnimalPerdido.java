
package superPatinhas;

import superPatinhas.DAOs.Entity;

public class AnimalPerdido  extends Entity {

    private Integer Id = -1;
    private String localVisto;

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
   