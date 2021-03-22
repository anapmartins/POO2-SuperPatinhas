
package superPatinhas.DAOs;

import superPatinhas.AnimalPerdido;
import superPatinhas.Interfaces.IAnimalPerdidoDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class AnimalPerdidoDAO implements IAnimalPerdidoDAO {
    int lastId = 0;
    public Dictionary<Integer, AnimalPerdido> dbAnimalPerdido = null;
    public AnimalPerdidoDAO(){
        dbAnimalPerdido = new Hashtable();
    }

    public AnimalPerdido Buscar(int id){
        return dbAnimalPerdido.get(id);
    }
    public boolean Inserir(AnimalPerdido objeto){
        AnimalPerdido exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbAnimalPerdido.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, AnimalPerdido objeto){
        AnimalPerdido ret = dbAnimalPerdido.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbAnimalPerdido.remove(id);
        dbAnimalPerdido.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        AnimalPerdido ret = dbAnimalPerdido.get(id);
        if(ret == null)
        {
            return false;
        }
        dbAnimalPerdido.remove(id);
        return true;
    }
}


