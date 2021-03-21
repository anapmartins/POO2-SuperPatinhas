/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superPatinhas;

import superPatinhas.builder.AdocaoDirector;
import superPatinhas.observer.Notificacao;

public class ProjetoSuperPatinhas {

    public static void main(String[] args) {
        AdocaoDirector iniciaAdocao = new AdocaoDirector();
    	Adocao adocao1 = iniciaAdocao.adotarAnimal("cpf", "Iniciada", "cachorro");

    	Usuario usuario = new Usuario();
    	Evento evento =  new Evento();
    	Notificacao notificacao = new Notificacao();
        notificacao.addObserver(usuario);
        evento.setLocal("sadsdas");
        notificacao.setNovaMensagem("dbasdgysaudgas222222");

         
    }
    
}
