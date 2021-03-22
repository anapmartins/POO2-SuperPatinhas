
package superPatinhas.DAOs;

import superPatinhas.Ong;
import superPatinhas.Interfaces.IOngDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class OngDAO implements IOngDAO {
    int lastId = 0;
    public Dictionary<Integer, Ong> dbOng = null;
    public OngDAO(){
        dbOng = new Hashtable();
    }

    public Ong Buscar(int id){
        return dbOng.get(id);
    }
    public boolean Inserir(Ong objeto){
        Ong exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbOng.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, Ong objeto){
        Ong ret = dbOng.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbOng.remove(id);
        dbOng.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        Ong ret = dbOng.get(id);
        if(ret == null)
        {
            return false;
        }
        dbOng.remove(id);
        return true;
    }
}


