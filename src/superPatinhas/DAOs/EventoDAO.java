
package superPatinhas.DAOs;

import superPatinhas.Evento;
import superPatinhas.Interfaces.IEventoDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class EventoDAO implements IEventoDAO {
    int lastId = 0;
    public Dictionary<Integer, Evento> dbEvento = null;
    public EventoDAO(){
        dbEvento = new Hashtable();
    }

    public Evento Buscar(int id){
        return dbEvento.get(id);
    }
    public boolean Inserir(Evento objeto){
        Evento exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbEvento.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, Evento objeto){
        Evento ret = dbEvento.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbEvento.remove(id);
        dbEvento.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        Evento ret = dbEvento.get(id);
        if(ret == null)
        {
            return false;
        }
        dbEvento.remove(id);
        return true;
    }
}


