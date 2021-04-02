package superPatinhas.Interfaces;

import superPatinhas.DAOs.Entity;

public interface IProjetoSuperPatinhasDAO {
    Entity Buscar(int id);

    boolean Inserir(Entity animal);

    boolean Alterar(int id, Entity animal);

    boolean Excluir(int id);


}
