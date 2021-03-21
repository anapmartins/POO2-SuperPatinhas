
package superPatinhas.DAOs;

import superPatinhas.AnimalCatalogado;
import superPatinhas.Interfaces.IAnimalCatalogadoDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class AnimalCatalogadoDAO implements IAnimalCatalogadoDAO {
    int lastId = 0;
    public Dictionary<Integer, AnimalCatalogado> dbAnimalCatalogado = null;
    public AnimalCatalogadoDAO(){
        dbAnimalCatalogado = new Hashtable();
    }

    public AnimalCatalogado Buscar(int id){
        return dbAnimalCatalogado.get(id);
    }
    public boolean Inserir(AnimalCatalogado animal){
        AnimalCatalogado exists = Buscar(animal.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        animal.setId(lastId);
        dbAnimalCatalogado.put (animal.getId(), animal);
        return true;
    }
    public boolean Alterar(int id, AnimalCatalogado animal){
        AnimalCatalogado ret = dbAnimalCatalogado.get(id);
        if(ret == null)
        {
           return false;
        }
        animal.setId(id);
        dbAnimalCatalogado.remove(id);
        dbAnimalCatalogado.put (id, animal);
        return true;
    };
    public boolean Excluir(int id){
        AnimalCatalogado ret = dbAnimalCatalogado.get(id);
        if(ret == null)
        {
            return false;
        }
        dbAnimalCatalogado.remove(id);
        return true;
    }
}


