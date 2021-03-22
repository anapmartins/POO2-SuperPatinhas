
package superPatinhas.DAOs;

import superPatinhas.Patrocinador;
import superPatinhas.Interfaces.IPatrocinadorDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class PatrocinadorDAO implements IPatrocinadorDAO {
    int lastId = 0;
    public Dictionary<Integer, Patrocinador> dbPatrocinador = null;
    public PatrocinadorDAO(){
        dbPatrocinador = new Hashtable();
    }

    public Patrocinador Buscar(int id){
        return dbPatrocinador.get(id);
    }
    public boolean Inserir(Patrocinador objeto){
        Patrocinador exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbPatrocinador.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, Patrocinador objeto){
        Patrocinador ret = dbPatrocinador.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbPatrocinador.remove(id);
        dbPatrocinador.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        Patrocinador ret = dbPatrocinador.get(id);
        if(ret == null)
        {
            return false;
        }
        dbPatrocinador.remove(id);
        return true;
    }
}


