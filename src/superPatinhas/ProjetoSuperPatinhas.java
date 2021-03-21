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
        Adocao adocao1 = iniciaAdocao.adotarAnimal("cpf", "Iniciada", "cachorro");
        Usuario user1 = new Usuario("teste", "teste", "teste", "teste", "teste", "teste");
        AnimalAdocao animal1 = new AnimalAdocao("teste", "teste", "teste");
        AnimalPerdido animal2 = new AnimalPerdido("teste");

        AnimalCatalogado animal3 = new AnimalCatalogado(1,"teste", 1, "teste", 1, 12, animal1, animal2);
        AnimalCatalogadoDAO catalogadoDAO = new AnimalCatalogadoDAO();
        AnimalCatalogado res = catalogadoDAO.Buscar(animal3.getId());
        boolean res1 = catalogadoDAO.Inserir(animal3);
        AnimalCatalogado res2 = catalogadoDAO.Buscar(animal3.getId());


        System.out.println("AnimalCatalogado res2");
        System.out.println(res2.getDescricoesFisicas());

    }
}
