
package superPatinhas.DAOs;

import superPatinhas.AjudaFinanceira;
import superPatinhas.Interfaces.IAjudaFinanceiraDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class AjudaFinanceiraDAO implements IAjudaFinanceiraDAO {
    int lastId = 0;
    public Dictionary<Integer, AjudaFinanceira> dbAjudaFinanceira = null;
    public AjudaFinanceiraDAO(){
        dbAjudaFinanceira = new Hashtable();
    }

    public AjudaFinanceira Buscar(int id){
        return dbAjudaFinanceira.get(id);
    }
    public boolean Inserir(AjudaFinanceira objeto){
        AjudaFinanceira exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbAjudaFinanceira.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, AjudaFinanceira objeto){
        AjudaFinanceira ret = dbAjudaFinanceira.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbAjudaFinanceira.remove(id);
        dbAjudaFinanceira.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        AjudaFinanceira ret = dbAjudaFinanceira.get(id);
        if(ret == null)
        {
            return false;
        }
        dbAjudaFinanceira.remove(id);
        return true;
    }
}


