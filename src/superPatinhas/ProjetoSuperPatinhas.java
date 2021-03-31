/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superPatinhas;

import superPatinhas.builder.AdocaoDirector;
import superPatinhas.observer.Inscrito;
import superPatinhas.observer.Notificacao;

public class ProjetoSuperPatinhas {

    public static void main(String[] args) {

        //Builder
/*    	 AdocaoDirector iniciaAdocao = new AdocaoDirector();
    	 Adocao adocao1 = iniciaAdocao.adotarAnimal("cpf", "Iniciada", "cachorro");*/

    	 //Observer
        Notificacao monitor = new Notificacao();

        Usuario teste = new Usuario("Joao", new Endereco(), "99900-1111", "emaildojoao@email.com", "123", "123.123.123-12", 18, Inscrito.EMAIL);
        Usuario teste2 = new Usuario("Maria", new Endereco(), "99900-2222", "emaildamaria@email.com", "123", "123.123.123-13", 21, Inscrito.TELEFONE);
        Usuario teste3 = new Usuario("Pedro", new Endereco(), "99900-3333", "emaildopedro@email.com", "123", "123.123.123-14", 25,null);

        monitor.addObserver(teste);
        monitor.addObserver(teste2);

        teste.update(monitor);
        teste2.update(monitor);
        teste3.update(monitor);

        System.out.println();

        monitor.setNovaMensagem("Venha adotar um caozinho!");
    }
    
}
