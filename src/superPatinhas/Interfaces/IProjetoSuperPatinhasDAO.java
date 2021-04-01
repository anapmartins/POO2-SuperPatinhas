package superPatinhas.Interfaces;

public interface IProjetoSuperPatinhasDAO<T> {
    T Buscar(int id);

    boolean Inserir(T animal);

    boolean Alterar(int id, T animal);

    boolean Excluir(int id);


}
