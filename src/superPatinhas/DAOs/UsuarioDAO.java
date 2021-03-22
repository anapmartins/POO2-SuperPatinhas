
package superPatinhas.DAOs;

import superPatinhas.Usuario;
import superPatinhas.Interfaces.IUsuarioDAO;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author joao
 */
public class UsuarioDAO implements IUsuarioDAO {
    int lastId = 0;
    public Dictionary<Integer, Usuario> dbUsuario = null;
    public UsuarioDAO(){
        dbUsuario = new Hashtable();
    }

    public Usuario Buscar(int id){
        return dbUsuario.get(id);
    }
    public boolean Inserir(Usuario objeto){
        Usuario exists = Buscar(objeto.getId());
        if(exists != null)
        {
            return false;
        }
        lastId++;
        objeto.setId(lastId);
        dbUsuario.put (objeto.getId(), objeto);
        return true;
    }
    public boolean Alterar(int id, Usuario objeto){
        Usuario ret = dbUsuario.get(id);
        if(ret == null)
        {
            return false;
        }
        objeto.setId(id);
        dbUsuario.remove(id);
        dbUsuario.put (id, objeto);
        return true;
    };
    public boolean Excluir(int id){
        Usuario ret = dbUsuario.get(id);
        if(ret == null)
        {
            return false;
        }
        dbUsuario.remove(id);
        return true;
    }
}


