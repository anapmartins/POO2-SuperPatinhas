package superPatinhas.Interfaces;

import superPatinhas.Adocao;

public interface IAdocaoDAO {
    Adocao Buscar(int id);

    boolean Inserir(Adocao animal);

    boolean Alterar(int id, Adocao animal);

    boolean Excluir(int id);
}
