package superPatinhas.Interfaces;

import superPatinhas.Evento;

public interface IEventoDAO {
    Evento Buscar(int id);

    boolean Inserir(Evento animal);

    boolean Alterar(int id, Evento animal);

    boolean Excluir(int id);
}
