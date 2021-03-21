/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superPatinhas;

import superPatinhas.DAOs.AnimalCatalogadoDAO;

public class ProjetoSuperPatinhas {

    public static void main(String[] args) {
        DiretorAdocao iniciaAdocao = new DiretorAdocao();
        AnimalCatalogadoDAO catalogadoDAO = new AnimalCatalogadoDAO();


        Adocao adocao1 = iniciaAdocao.adotarAnimal("cpf", "Iniciada", "cachorro");
        Usuario user1 = new Usuario("teste", "teste", "teste", "teste", "teste", "teste");
        AnimalAdocao animal1 = new AnimalAdocao("teste", "teste", "teste");
        AnimalPerdido animal2 = new AnimalPerdido("teste");

        AnimalCatalogado animal3 = new AnimalCatalogado("teste", 1, "teste3", 1, 12, animal1, animal2);
        AnimalCatalogado animal4 = new AnimalCatalogado("teste", 1, "teste4", 1, 12, animal1, animal2);
        AnimalCatalogado animal5 = new AnimalCatalogado("teste", 1, "teste5", 1, 12, animal1, animal2);
        AnimalCatalogado animal6 = new AnimalCatalogado("teste", 1, "teste6", 1, 12, animal1, animal2);
        AnimalCatalogado animal7 = new AnimalCatalogado("teste", 1, "teste7", 1, 12, animal1, animal2);
        AnimalCatalogado animal8 = new AnimalCatalogado("teste", 1, "teste8", 1, 12, animal1, animal2);
        AnimalCatalogado animal9 = new AnimalCatalogado("teste", 1, "teste9", 1, 12, animal1, animal2);

        System.out.println(catalogadoDAO.dbAnimalCatalogado);

        catalogadoDAO.Inserir(animal3);
        catalogadoDAO.Inserir(animal4);
        catalogadoDAO.Inserir(animal5);
        catalogadoDAO.Inserir(animal6);

        System.out.println(catalogadoDAO.dbAnimalCatalogado);

        catalogadoDAO.Alterar(animal4.getId(),animal7);
        catalogadoDAO.Alterar(animal5.getId(),animal8);
        catalogadoDAO.Alterar(animal6.getId(),animal9);

        System.out.println(catalogadoDAO.dbAnimalCatalogado);

        catalogadoDAO.Excluir(animal3.getId());
        catalogadoDAO.Excluir(animal4.getId());
        catalogadoDAO.Excluir(animal5.getId());
        catalogadoDAO.Excluir(animal6.getId());

        System.out.println(catalogadoDAO.dbAnimalCatalogado);
    }
}
