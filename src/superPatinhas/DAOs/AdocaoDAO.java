
package superPatinhas.DAOs;

import superPatinhas.Adocao;
import superPatinhas.Interfaces.IAdocaoDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class AdocaoDAO implements IAdocaoDAO {
    int lastId = 0;
    public Dictionary<Integer, Adocao> dbAdocao = null;
    public AdocaoDAO(){
        dbAdocao = new Hashtable();
    }

    public Adocao Buscar(int id){
        return dbAdocao.get(id);
    }
    public boolean Inserir(Adocao objeto){
        Adocao exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbAdocao.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, Adocao objeto){
        Adocao ret = dbAdocao.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbAdocao.remove(id);
        dbAdocao.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        Adocao ret = dbAdocao.get(id);
        if(ret == null)
        {
            return false;
        }
        dbAdocao.remove(id);
        return true;
    }
}


