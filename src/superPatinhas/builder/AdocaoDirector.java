package superPatinhas.builder;

import superPatinhas.Adocao;

public class AdocaoDirector {
	
	public Adocao adotarAnimal(String documento, String estado, String animal) {
		Adocao novaAdocao = new Adocao(documento, estado, animal);
		AdocaoBuilder adocaoBuilder = new AdocaoBuilder(novaAdocao);
		
		adocaoBuilder.documentosExigidos(documento);
		adocaoBuilder.informaEstadoAdocao(estado);
		adocaoBuilder.animalEscolhido(animal);
		
		return novaAdocao;
		
	}
}
