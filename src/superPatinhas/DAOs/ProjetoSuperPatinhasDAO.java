package superPatinhas.DAOs;

import superPatinhas.Interfaces.IProjetoSuperPatinhasDAO;

import java.util.Dictionary;
import java.util.Hashtable;

public class ProjetoSuperPatinhasDAO implements IProjetoSuperPatinhasDAO {
    int lastId = 0;
    public Dictionary<Integer, Entity> db = null;
    public ProjetoSuperPatinhasDAO(){
        db = new Hashtable();
    }

    public Entity Buscar(int id){
        return db.get(id);
    }
    public boolean Inserir(Entity objeto){
        Entity exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        db.put(objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, Entity objeto){
        Entity ret = db.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        db.remove(id);
        db.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        Entity ret = db.get(id);
        if(ret == null)
        {
            return false;
        }
        db.remove(id);
        return true;
    }
}
