package superPatinhas.Interfaces;

import superPatinhas.Ong;

public interface IOngDAO {
    Ong Buscar(int id);

    boolean Inserir(Ong animal);

    boolean Alterar(int id, Ong animal);

    boolean Excluir(int id);
}
