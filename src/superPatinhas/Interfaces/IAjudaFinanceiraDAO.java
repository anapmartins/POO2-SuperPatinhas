package superPatinhas.Interfaces;

import superPatinhas.AjudaFinanceira;

public interface IAjudaFinanceiraDAO {
    AjudaFinanceira Buscar(int id);

    boolean Inserir(AjudaFinanceira animal);

    boolean Alterar(int id, AjudaFinanceira animal);

    boolean Excluir(int id);
}
