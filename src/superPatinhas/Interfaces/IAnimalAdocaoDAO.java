package superPatinhas.Interfaces;

import superPatinhas.AnimalAdocao;

public interface IAnimalAdocaoDAO {
    AnimalAdocao Buscar(int id);

    boolean Inserir(AnimalAdocao animal);

    boolean Alterar(int id, AnimalAdocao animal);

    boolean Excluir(int id);
}
