package superPatinhas.Interfaces;

import superPatinhas.AnimalCatalogado;

public interface IAnimalCatalogadoDAO {

    AnimalCatalogado Buscar(int id);

    boolean Inserir(AnimalCatalogado animal);

    boolean Alterar(AnimalCatalogado animal);

    boolean Excluir(int id);


}