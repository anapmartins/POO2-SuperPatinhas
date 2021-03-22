package superPatinhas.Interfaces;

import superPatinhas.AnimalPerdido;

public interface IAnimalPerdidoDAO {
    AnimalPerdido Buscar(int id);

    boolean Inserir(AnimalPerdido animal);

    boolean Alterar(int id, AnimalPerdido animal);

    boolean Excluir(int id);
}
