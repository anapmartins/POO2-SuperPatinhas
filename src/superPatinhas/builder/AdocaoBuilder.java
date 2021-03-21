package superPatinhas.builder;


import superPatinhas.Adocao;

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
    
    public void animalEscolhido(String animal){
       this.adocao.setAnimal(animal);       
    }
    
}



