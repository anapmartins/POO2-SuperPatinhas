package superPatinhas.Interfaces;

import superPatinhas.Patrocinador;
    
public interface IPatrocinadorDAO {
    Patrocinador Buscar(int id);

    boolean Inserir(Patrocinador animal);

    boolean Alterar(int id, Patrocinador animal);

    boolean Excluir(int id);
}
