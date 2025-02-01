package br.ufpr.lpoo.tarefa07.exercicio2;

import org.junit.Assert;
import org.junit.Test;

public class TestaBicicleta {

    @Test
    public void testaBicicletaMarchaInvalida(){
        Bicicleta b1 = new Bicicleta();
        try {
            b1.mudarMarcha(25);
        } catch (BikeException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("O valor da marchar deve estar entre 0 e 24", e.getMessage());
        }
    }

    @Test
    public void testaBicicletaAumentarVelocidade(){
        Bicicleta b1 = new Bicicleta(30,20,16);
        try {
            b1.aumentarVelocidade(81);
        } catch (BikeException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("A velocidade não pode exceder 100 km/h", e.getMessage());
        }
    }

    @Test
    public void testaBicicletaAplicarFreios(){
        Bicicleta b1 = new Bicicleta(30,20,16);
        try {
            b1.aplicarFreios(21);
        } catch (BikeException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("A velocidade não pode ser negativa", e.getMessage());
        }
    }

    @Test
    public void testaBicicletaMudarCadencia(){
        Bicicleta b1 = new Bicicleta();
        try{
            b1.mudarCadencia(-1);
        } catch (BikeException e){
            System.out.println(e.getMessage());
            Assert.assertEquals("O RPM não pode ser menor que 0", e.getMessage());
        }
    }
}
