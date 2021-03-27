package superPatinhas;

	
public class AdocaoBuilder {   
	Adocao adocao;
	
	public AdocaoBuilder(Adocao adocao) {
		this.adocao = adocao;
	}
    
    public void documentosExigidos(String documento){                                
        this.adocao.setDocumentosExigidos(documento);        
    }   
       
    public void informaEstadoAdocao(String estado){
        this.adocao.setEstadoAdocao(estado);        
    }   
    
    public static void handle(){
		AdocaoHandler pequeno = new AdocaoPortePequeno();
		AdocaoHandler medio = new AdocaoPorteMedio();
		AdocaoHandler grande = new AdocaoPorteGrande();
		
		pequeno.setNextHandler(medio);
		medio.setNextHandler(grande);
	}
    
    public void animalEscolhido(String animal){
       this.adocao.setAnimal(animal);       
    }
    
}



