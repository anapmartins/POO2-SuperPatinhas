/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superPatinhas;

import superPatinhas.DAOs.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ProjetoSuperPatinhas {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("Log.txt"));
        System.setOut(o);
        //Instancias DAOs
        AnimalCatalogadoDAO catalogadoDAO = new AnimalCatalogadoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        AdocaoDAO adocaoDAO = new AdocaoDAO();
        AjudaFinanceiraDAO ajudaFinanceiraDAO = new AjudaFinanceiraDAO();
        AnimalAdocaoDAO animalAdocaoDAO = new AnimalAdocaoDAO();
        AnimalPerdidoDAO animalPerdidoDAO = new AnimalPerdidoDAO();
        EventoDAO eventoDAO = new EventoDAO();
        OngDAO ongDAO = new OngDAO();
        PatrocinadorDAO patrocinadorDAO = new PatrocinadorDAO();
        //Testes DAO
        TesteAdocaoDAO(adocaoDAO);
        TesteAjudaFinanceiraDAO(ajudaFinanceiraDAO);
        TesteAnimalAdocaoDAO(animalAdocaoDAO);
        TesteAnimalCatalogadoDAO(catalogadoDAO);
        TesteAnimalPerdidoDAO(animalPerdidoDAO);
        TesteEventoDAO(eventoDAO);
        TesteOngDAO(ongDAO);
        TestePatrocinadorDAO(patrocinadorDAO);
        TesteUsuarioDAO(usuarioDAO);



        //Init app
        DiretorAdocao iniciaAdocao = new DiretorAdocao();
        Adocao adocao1 = iniciaAdocao.adotarAnimal("cpf", "Iniciada", "cachorro");



    }


    public static void TesteAdocaoDAO(AdocaoDAO adocaoDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        Adocao adocao1 = new Adocao("teste1","teste1","teste1");
        Adocao adocao2 = new Adocao("teste2","teste2","teste2");
        Adocao adocao3 = new Adocao("teste3","teste3","teste3");
        Adocao adocao4 = new Adocao("teste4","teste4","teste4");
        Adocao adocao5 = new Adocao("teste5","teste5","teste5");
        Adocao adocao6 = new Adocao("teste6","teste6","teste6");
        Adocao adocao7 = new Adocao("teste7","teste7","teste7");

        //Do
        Logger(3,methodName);
        System.out.println(adocaoDAO.dbAdocao.toString());


        Logger(4,methodName);
        adocaoDAO.Inserir(adocao1);
        adocaoDAO.Inserir(adocao2);
        adocaoDAO.Inserir(adocao3);
        adocaoDAO.Inserir(adocao4);


        Logger(5,methodName);
        System.out.println(adocaoDAO.dbAdocao);


        Logger(6,methodName);
        adocaoDAO.Alterar(adocao2.getId(),adocao5);
        adocaoDAO.Alterar(adocao3.getId(),adocao6);
        adocaoDAO.Alterar(adocao4.getId(),adocao7);

        Logger(7,methodName);
        System.out.println(adocaoDAO.dbAdocao);

        Logger(8,methodName);
        adocaoDAO.Excluir(adocao1.getId());
        adocaoDAO.Excluir(adocao2.getId());
        adocaoDAO.Excluir(adocao3.getId());
        adocaoDAO.Excluir(adocao4.getId());

        Logger(9,methodName);
        System.out.println(adocaoDAO.dbAdocao);
        Logger(10,methodName);
    }
    public static void TesteAjudaFinanceiraDAO(AjudaFinanceiraDAO ajudaFinanceiraDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        AjudaFinanceira ajudaFinanceira1 = new AjudaFinanceira(randomBigDecimal());
        AjudaFinanceira ajudaFinanceira2 = new AjudaFinanceira(randomBigDecimal());
        AjudaFinanceira ajudaFinanceira3 = new AjudaFinanceira(randomBigDecimal());
        AjudaFinanceira ajudaFinanceira4 = new AjudaFinanceira(randomBigDecimal());
        AjudaFinanceira ajudaFinanceira5 = new AjudaFinanceira(randomBigDecimal());
        AjudaFinanceira ajudaFinanceira6 = new AjudaFinanceira(randomBigDecimal());
        AjudaFinanceira ajudaFinanceira7 = new AjudaFinanceira(randomBigDecimal());

        //Do
        Logger(3,methodName);
        System.out.println(ajudaFinanceiraDAO.dbAjudaFinanceira);

        Logger(4,methodName);
        ajudaFinanceiraDAO.Inserir(ajudaFinanceira1);
        ajudaFinanceiraDAO.Inserir(ajudaFinanceira2);
        ajudaFinanceiraDAO.Inserir(ajudaFinanceira3);
        ajudaFinanceiraDAO.Inserir(ajudaFinanceira4);

        Logger(5,methodName);
        System.out.println(ajudaFinanceiraDAO.dbAjudaFinanceira);

        Logger(6,methodName);
        ajudaFinanceiraDAO.Alterar(ajudaFinanceira2.getId(),ajudaFinanceira5);
        ajudaFinanceiraDAO.Alterar(ajudaFinanceira3.getId(),ajudaFinanceira6);
        ajudaFinanceiraDAO.Alterar(ajudaFinanceira4.getId(),ajudaFinanceira7);

        Logger(7,methodName);
        System.out.println(ajudaFinanceiraDAO.dbAjudaFinanceira);

        Logger(8,methodName);
        ajudaFinanceiraDAO.Excluir(ajudaFinanceira1.getId());
        ajudaFinanceiraDAO.Excluir(ajudaFinanceira2.getId());
        ajudaFinanceiraDAO.Excluir(ajudaFinanceira3.getId());
        ajudaFinanceiraDAO.Excluir(ajudaFinanceira4.getId());

        Logger(9,methodName);
        System.out.println(ajudaFinanceiraDAO.dbAjudaFinanceira);
        Logger(10,methodName);
    }
    public static void TesteAnimalAdocaoDAO(AnimalAdocaoDAO animalAdocaoDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        AnimalAdocao animalAdocao1 = new AnimalAdocao("teste1","teste1","teste1");
        AnimalAdocao animalAdocao2 = new AnimalAdocao("teste2","teste2","teste2");
        AnimalAdocao animalAdocao3 = new AnimalAdocao("teste3","teste3","teste3");
        AnimalAdocao animalAdocao4 = new AnimalAdocao("teste4","teste4","teste4");
        AnimalAdocao animalAdocao5 = new AnimalAdocao("teste5","teste5","teste5");
        AnimalAdocao animalAdocao6 = new AnimalAdocao("teste6","teste6","teste6");
        AnimalAdocao animalAdocao7 = new AnimalAdocao("teste7","teste7","teste7");

        //Do
        Logger(3,methodName);
        System.out.println(animalAdocaoDAO.dbAnimalAdocao);

        Logger(4,methodName);
        animalAdocaoDAO.Inserir(animalAdocao1);
        animalAdocaoDAO.Inserir(animalAdocao2);
        animalAdocaoDAO.Inserir(animalAdocao3);
        animalAdocaoDAO.Inserir(animalAdocao4);

        Logger(5,methodName);
        System.out.println(animalAdocaoDAO.dbAnimalAdocao);

        Logger(6,methodName);
        animalAdocaoDAO.Excluir(animalAdocao1.getId());
        animalAdocaoDAO.Excluir(animalAdocao2.getId());
        animalAdocaoDAO.Excluir(animalAdocao3.getId());
        animalAdocaoDAO.Excluir(animalAdocao4.getId());

        Logger(7,methodName);
        System.out.println(animalAdocaoDAO.dbAnimalAdocao);

        Logger(8,methodName);
        animalAdocaoDAO.Alterar(animalAdocao2.getId(),animalAdocao5);
        animalAdocaoDAO.Alterar(animalAdocao3.getId(),animalAdocao6);
        animalAdocaoDAO.Alterar(animalAdocao4.getId(),animalAdocao7);

        Logger(9,methodName);
        System.out.println(animalAdocaoDAO.dbAnimalAdocao);
        Logger(10,methodName);
    }
    public static void TesteAnimalCatalogadoDAO(AnimalCatalogadoDAO catalogadoDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        AnimalAdocao animal1 = new AnimalAdocao("teste", "teste", "teste");
        AnimalPerdido animal2 = new AnimalPerdido("teste");
        AnimalCatalogado animal3 = new AnimalCatalogado("teste", 1, "teste3", 1, 12, animal1, animal2);
        AnimalCatalogado animal4 = new AnimalCatalogado("teste", 1, "teste4", 1, 12, animal1, animal2);
        AnimalCatalogado animal5 = new AnimalCatalogado("teste", 1, "teste5", 1, 12, animal1, animal2);
        AnimalCatalogado animal6 = new AnimalCatalogado("teste", 1, "teste6", 1, 12, animal1, animal2);
        AnimalCatalogado animal7 = new AnimalCatalogado("teste", 1, "teste7", 1, 12, animal1, animal2);
        AnimalCatalogado animal8 = new AnimalCatalogado("teste", 1, "teste8", 1, 12, animal1, animal2);
        AnimalCatalogado animal9 = new AnimalCatalogado("teste", 1, "teste9", 1, 12, animal1, animal2);

        //Do
        Logger(3,methodName);
        System.out.println(catalogadoDAO.dbAnimalCatalogado);

        Logger(4,methodName);
        catalogadoDAO.Inserir(animal3);
        catalogadoDAO.Inserir(animal4);
        catalogadoDAO.Inserir(animal5);
        catalogadoDAO.Inserir(animal6);

        Logger(5,methodName);
        System.out.println(catalogadoDAO.dbAnimalCatalogado);

        Logger(6,methodName);
        catalogadoDAO.Alterar(animal4.getId(),animal7);
        catalogadoDAO.Alterar(animal5.getId(),animal8);
        catalogadoDAO.Alterar(animal6.getId(),animal9);

        Logger(7,methodName);
        System.out.println(catalogadoDAO.dbAnimalCatalogado);

        Logger(8,methodName);
        catalogadoDAO.Excluir(animal3.getId());
        catalogadoDAO.Excluir(animal4.getId());
        catalogadoDAO.Excluir(animal5.getId());
        catalogadoDAO.Excluir(animal6.getId());

        Logger(9,methodName);
        System.out.println(catalogadoDAO.dbAnimalCatalogado);
        Logger(10,methodName);
    }
    public static void TesteAnimalPerdidoDAO(AnimalPerdidoDAO animalPerdidoDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        AnimalPerdido animalPerdido1 = new AnimalPerdido("teste1");
        AnimalPerdido animalPerdido2 = new AnimalPerdido("teste2");
        AnimalPerdido animalPerdido3 = new AnimalPerdido("teste3");
        AnimalPerdido animalPerdido4 = new AnimalPerdido("teste4");
        AnimalPerdido animalPerdido5 = new AnimalPerdido("teste5");
        AnimalPerdido animalPerdido6 = new AnimalPerdido("teste6");
        AnimalPerdido animalPerdido7 = new AnimalPerdido("teste7");

        //Do
        Logger(3,methodName);
        System.out.println(animalPerdidoDAO.dbAnimalPerdido);

        Logger(4,methodName);
        animalPerdidoDAO.Inserir(animalPerdido1);
        animalPerdidoDAO.Inserir(animalPerdido2);
        animalPerdidoDAO.Inserir(animalPerdido3);
        animalPerdidoDAO.Inserir(animalPerdido4);

        Logger(5,methodName);
        System.out.println(animalPerdidoDAO.dbAnimalPerdido);

        Logger(6,methodName);
        animalPerdidoDAO.Alterar(animalPerdido2.getId(),animalPerdido5);
        animalPerdidoDAO.Alterar(animalPerdido3.getId(),animalPerdido6);
        animalPerdidoDAO.Alterar(animalPerdido4.getId(),animalPerdido7);

        Logger(7,methodName);
        System.out.println(animalPerdidoDAO.dbAnimalPerdido);

        Logger(8,methodName);
        animalPerdidoDAO.Excluir(animalPerdido1.getId());
        animalPerdidoDAO.Excluir(animalPerdido2.getId());
        animalPerdidoDAO.Excluir(animalPerdido3.getId());
        animalPerdidoDAO.Excluir(animalPerdido4.getId());

        Logger(9,methodName);
        System.out.println(animalPerdidoDAO.dbAnimalPerdido);
        Logger(10,methodName);
    }
    public static void TesteEventoDAO(EventoDAO eventoDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        Evento evento1 = new Evento(randomDate(),"teste1","teste1");
        Evento evento2 = new Evento(randomDate(),"teste2","teste2");
        Evento evento3 = new Evento(randomDate(),"teste3","teste3");
        Evento evento4 = new Evento(randomDate(),"teste4","teste4");
        Evento evento5 = new Evento(randomDate(),"teste5","teste5");
        Evento evento6 = new Evento(randomDate(),"teste6","teste6");
        Evento evento7 = new Evento(randomDate(),"teste7","teste7");

        //Do
        Logger(3,methodName);
        System.out.println(eventoDAO.dbEvento);

        Logger(4,methodName);
        eventoDAO.Inserir(evento1);
        eventoDAO.Inserir(evento2);
        eventoDAO.Inserir(evento3);
        eventoDAO.Inserir(evento4);

        Logger(5,methodName);
        System.out.println(eventoDAO.dbEvento);

        Logger(6,methodName);
        eventoDAO.Alterar(evento2.getId(),evento5);
        eventoDAO.Alterar(evento3.getId(),evento6);
        eventoDAO.Alterar(evento4.getId(),evento7);

        Logger(7,methodName);
        System.out.println(eventoDAO.dbEvento);

        Logger(8,methodName);
        eventoDAO.Excluir(evento1.getId());
        eventoDAO.Excluir(evento2.getId());
        eventoDAO.Excluir(evento3.getId());
        eventoDAO.Excluir(evento4.getId());

        Logger(9,methodName);
        System.out.println(eventoDAO.dbEvento);
        Logger(10,methodName);
    }
    public static void TesteOngDAO(OngDAO ongDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        Ong ong1 = new Ong("teste1","teste1","teste1");
        Ong ong2 = new Ong("teste2","teste2","teste2");
        Ong ong3 = new Ong("teste3","teste3","teste3");
        Ong ong4 = new Ong("teste4","teste4","teste4");
        Ong ong5 = new Ong("teste5","teste5","teste5");
        Ong ong6 = new Ong("teste6","teste6","teste6");
        Ong ong7 = new Ong("teste7","teste7","teste7");

        //Do
        Logger(3,methodName);
        System.out.println(ongDAO.dbOng);

        Logger(4,methodName);
        ongDAO.Inserir(ong1);
        ongDAO.Inserir(ong2);
        ongDAO.Inserir(ong3);
        ongDAO.Inserir(ong4);

        Logger(5,methodName);
        System.out.println(ongDAO.dbOng);

        Logger(6,methodName);
        ongDAO.Alterar(ong2.getId(),ong5);
        ongDAO.Alterar(ong3.getId(),ong6);
        ongDAO.Alterar(ong4.getId(),ong7);

        Logger(7,methodName);
        System.out.println(ongDAO.dbOng);

        Logger(8,methodName);
        ongDAO.Excluir(ong1.getId());
        ongDAO.Excluir(ong2.getId());
        ongDAO.Excluir(ong3.getId());
        ongDAO.Excluir(ong4.getId());

        Logger(9,methodName);
        System.out.println(ongDAO.dbOng);
        Logger(10,methodName);
    }
    public static void TestePatrocinadorDAO(PatrocinadorDAO patrocinadorDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        Patrocinador patrocinador1 = new Patrocinador("teste1",null,"teste1");
        Patrocinador patrocinador2 = new Patrocinador("teste2",null,"teste2");
        Patrocinador patrocinador3 = new Patrocinador("teste3","teste3",null);
        Patrocinador patrocinador4 = new Patrocinador("teste4",null,"teste4");
        Patrocinador patrocinador5 = new Patrocinador("teste5",null,"teste5");
        Patrocinador patrocinador6 = new Patrocinador("teste6","teste6",null);
        Patrocinador patrocinador7 = new Patrocinador("teste7","teste7",null);

        //Do
        Logger(3,methodName);
        System.out.println(patrocinadorDAO.dbPatrocinador);

        Logger(4,methodName);
        patrocinadorDAO.Inserir(patrocinador1);
        patrocinadorDAO.Inserir(patrocinador2);
        patrocinadorDAO.Inserir(patrocinador3);
        patrocinadorDAO.Inserir(patrocinador4);

        Logger(5,methodName);
        System.out.println(patrocinadorDAO.dbPatrocinador);

        Logger(6,methodName);
        patrocinadorDAO.Alterar(patrocinador2.getId(),patrocinador5);
        patrocinadorDAO.Alterar(patrocinador3.getId(),patrocinador6);
        patrocinadorDAO.Alterar(patrocinador4.getId(),patrocinador7);

        Logger(7,methodName);
        System.out.println(patrocinadorDAO.dbPatrocinador);

        Logger(8,methodName);
        patrocinadorDAO.Excluir(patrocinador1.getId());
        patrocinadorDAO.Excluir(patrocinador2.getId());
        patrocinadorDAO.Excluir(patrocinador3.getId());
        patrocinadorDAO.Excluir(patrocinador4.getId());

        Logger(9,methodName);
        System.out.println(patrocinadorDAO.dbPatrocinador);
        Logger(10,methodName);
    }
    public static void TesteUsuarioDAO(UsuarioDAO usuarioDAO){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName =stackTraceElements[1].getMethodName();
        Logger(1,methodName);
        //Arrange
        Logger(2,methodName);
        Usuario usuario1 = new Usuario("teste1","teste1","teste1","teste1","teste1","teste1");
        Usuario usuario2 = new Usuario("teste2","teste2","teste2","teste2","teste2","teste2");
        Usuario usuario3 = new Usuario("teste3","teste3","teste3","teste3","teste3","teste3");
        Usuario usuario4 = new Usuario("teste4","teste4","teste4","teste4","teste4","teste4");
        Usuario usuario5 = new Usuario("teste5","teste5","teste5","teste5","teste5","teste5");
        Usuario usuario6 = new Usuario("teste6","teste6","teste6","teste6","teste6","teste6");
        Usuario usuario7 = new Usuario("teste7","teste7","teste7","teste7","teste7","teste7");

        //Do
        Logger(3,methodName);
        System.out.println(usuarioDAO.dbUsuario);

        Logger(4,methodName);
        usuarioDAO.Inserir(usuario1);
        usuarioDAO.Inserir(usuario2);
        usuarioDAO.Inserir(usuario3);
        usuarioDAO.Inserir(usuario4);

        Logger(5,methodName);
        System.out.println(usuarioDAO.dbUsuario);

        Logger(6,methodName);
        usuarioDAO.Alterar(usuario2.getId(),usuario5);
        usuarioDAO.Alterar(usuario3.getId(),usuario6);
        usuarioDAO.Alterar(usuario4.getId(),usuario7);

        Logger(7,methodName);
        System.out.println(usuarioDAO.dbUsuario);

        Logger(8,methodName);
        usuarioDAO.Excluir(usuario1.getId());
        usuarioDAO.Excluir(usuario2.getId());
        usuarioDAO.Excluir(usuario3.getId());
        usuarioDAO.Excluir(usuario4.getId());

        Logger(9,methodName);
        System.out.println(usuarioDAO.dbUsuario);
        Logger(10,methodName);
    }



    public static BigDecimal randomBigDecimal() {
        int range = 100000;
        BigDecimal max = new BigDecimal(range);
        BigDecimal randFromDouble = new BigDecimal(Math.random());
        BigDecimal actualRandomDec = randFromDouble.multiply(max);
        actualRandomDec = actualRandomDec
                .setScale(2, RoundingMode.DOWN);
        System.out.println(actualRandomDec);

        return actualRandomDec;
    }
    public static Date randomDate() {
        LocalDate startDate = LocalDate.of(1990, 1, 1); //start date
        long start = startDate.toEpochDay();


        LocalDate endDate = LocalDate.now(); //end date
        long end = endDate.toEpochDay();


        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        LocalDate randomLocalDate = LocalDate.ofEpochDay(randomEpochDay);
        Date randomDate = Date.from(randomLocalDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());

        return randomDate;
    }
    public static void Logger(int type, String methodName)
    {
        System.out.println(String.format(""));

        switch (type)
        {
            case 1:
                System.out.println(String.format("##### INICIO %s #####",methodName));
                break;
            case 2:
                System.out.println(String.format("Criando classes necessárias..."));
                break;
            case 3:
                System.out.println(String.format("Repositorio Inicial: "));
                break;
            case 4:
                System.out.println(String.format("Inserindo dados... "));
                break;
            case 5:
                System.out.println(String.format("Repositorio Após Inserção: "));
                break;
            case 6:
                System.out.println(String.format("Alterando dados... "));
                break;
            case 7:
                System.out.println(String.format("Repositorio Após Alteração: "));
                break;
            case 8:
                System.out.println(String.format("Excluindo dados... "));
                break;
            case 9:
                System.out.println(String.format("Repositorio Após Exclusão: "));
                break;
            case 10:
                System.out.println(String.format("##### FIM %s #####",methodName));
                break;
        }



    }


}
