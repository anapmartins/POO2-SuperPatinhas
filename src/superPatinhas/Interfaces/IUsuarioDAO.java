package superPatinhas.Interfaces;

import superPatinhas.Usuario;

public interface IUsuarioDAO {
    Usuario Buscar(int id);

    boolean Inserir(Usuario animal);

    boolean Alterar(int id, Usuario animal);

    boolean Excluir(int id);

}
