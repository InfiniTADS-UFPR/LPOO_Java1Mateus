package br.ufpr.lpoo.tarefa05.exercicio4;

import org.junit.Assert;
import org.junit.Test;

public class TestaBicicleta {

    @Test
    public void testaBicicletaComParametro() {
        Bicicleta b1 = new Bicicleta(10);
        String estadoEsperado = "Velocidade: 0.0, Marcha: 1, Total de marchas: 10";
        System.out.println(b1.imprimeEstado());

        Assert.assertEquals(estadoEsperado, b1.imprimeEstado());

    }

    @Test
    public void testaBicicletaSemParametro() {
        Bicicleta b1 = new Bicicleta();
        String estadoEsperado = "Velocidade: 0.0, Marcha: 1, Total de marchas: 18";
        System.out.println(b1.imprimeEstado());

        Assert.assertEquals(estadoEsperado, b1.imprimeEstado());
    }

    @Test
    public void testaBicicletaParada(){
        Bicicleta b1 = new Bicicleta();
        String estadoEsperado = "Velocidade: 0.0, Marcha: 1, Total de marchas: 18";
        System.out.println(b1.imprimeEstado());

        Assert.assertEquals(estadoEsperado, b1.imprimeEstado());
    }

    @Test
    public void testaBicicletaMarchaInvalida(){
        Bicicleta b1 = new Bicicleta();
        b1.mudarMarcha(19);
        String estadoEsperado = "Velocidade: 0.0, Marcha: 1, Total de marchas: 18";
        System.out.println(b1.imprimeEstado());

        Assert.assertEquals(estadoEsperado, b1.imprimeEstado());
    }
}
