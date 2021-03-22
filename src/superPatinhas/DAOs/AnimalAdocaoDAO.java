
package superPatinhas.DAOs;

import superPatinhas.AnimalAdocao;
import superPatinhas.Interfaces.IAnimalAdocaoDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class AnimalAdocaoDAO implements IAnimalAdocaoDAO {
    int lastId = 0;
    public Dictionary<Integer, AnimalAdocao> dbAnimalAdocao = null;
    public AnimalAdocaoDAO(){
        dbAnimalAdocao = new Hashtable();
    }

    public AnimalAdocao Buscar(int id){
        return dbAnimalAdocao.get(id);
    }
    public boolean Inserir(AnimalAdocao objeto){
        AnimalAdocao exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbAnimalAdocao.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, AnimalAdocao objeto){
        AnimalAdocao ret = dbAnimalAdocao.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbAnimalAdocao.remove(id);
        dbAnimalAdocao.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        AnimalAdocao ret = dbAnimalAdocao.get(id);
        if(ret == null)
        {
            return false;
        }
        dbAnimalAdocao.remove(id);
        return true;
    }
}


