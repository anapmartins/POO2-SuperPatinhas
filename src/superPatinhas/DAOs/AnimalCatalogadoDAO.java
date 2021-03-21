
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
    Dictionary<Integer, AnimalCatalogado> dbAnimalCatalogado = new Hashtable();
    /*JSONParser parser = new JSONParser();
    Path pathRepo = Path.of(System.getProperty("user.dir"), "src","Repos","repoAnimalCatalogado.json").toAbsolutePath();*/

    public AnimalCatalogadoDAO(){
        System.out.println(dbAnimalCatalogado);
        /*System.out.println("Working Directory = " + System.getProperty("user.dir"));
        System.out.println("Path of = " + Path.of(System.getProperty("user.dir"), "src","Repos","repoAnimalCatalogado.json"));
        CreateRepo();
        try {
            CreateRepo();
            FileReader fileRepo = ReadRepo();
            if(fileRepo == null){
                System.out.println("deu pra ler n fi");
                return;
            }
            Object obj = parser.parse(fileRepo);
            JSONObject jsonObject =  (JSONObject) obj;
            this.dbAnimalCatalogado = jsonObject;
            dbAnimalCatalogado.put("5","6");
            WriteRepo();



        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("7 teste");
            this.dbAnimalCatalogado = new JSONObject();
            dbAnimalCatalogado.put("1","2");
            WriteRepo();

        } catch (ParseException e) {
            System.out.println("8 teste");
            this.dbAnimalCatalogado = new JSONObject();
            dbAnimalCatalogado.put("3","4");
            WriteRepo();
        }*/
    }




    public AnimalCatalogado Buscar(int id){
        //Object res = dbAnimalCatalogado.get(id);
        return dbAnimalCatalogado.get(id);
        //return res;
    }
    public boolean Inserir(AnimalCatalogado animal){

        AnimalCatalogado exists = Buscar(animal.getId());
        if(exists != null)
        {
            return false;
        }
        dbAnimalCatalogado.put (animal.getId(), animal);
        System.out.println(dbAnimalCatalogado);

        /*try (FileWriter file = new FileWriter("./Interfaces/repoAnimalCatalogado.json")) {
            file.write(dbAnimalCatalogado.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }


        DbEntity newInsert = new DbEntity(animal.getId(), );*/

        return true;
    }
    public boolean Alterar(AnimalCatalogado animal){

        return true;
    };
    public boolean Excluir(int id){
        return true;
    }

   /*public void WriteRepo()
   {
       try (FileWriter file = new FileWriter(pathRepo.toString())) {
           file.write(dbAnimalCatalogado.toJSONString());
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    public FileReader ReadRepo()
    {
        try {
            return new FileReader(pathRepo.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            WriteRepo();
            return null;
        }

    }

    public boolean CreateRepo()
    {
        File file = new File(pathRepo.toString());
        System.out.println("file");
        System.out.println(pathRepo.);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(file.createNewFile())
            {
                System.out.println("arquivo criado");
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("arquivo ja existente");
        return false;
    }*/


}


