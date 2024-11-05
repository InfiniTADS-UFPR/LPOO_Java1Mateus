/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lpoo_2024.Aula5.Estatistica.Estatistica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mateus
 */
public class TesteEstatistica {
    
    public TesteEstatistica() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testaSoma1() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(177.0);
         stat.adicionaValor(200.0);
         stat.adicionaValor(181.0);
         stat.adicionaValor(180.0);
         stat.adicionaValor(173.0);
         stat.adicionaValor(185.0);
         
         double resultado = stat.getSoma();
         double esperado = 1096.0;
         
         assertEquals(esperado,resultado,0.0);
     }
     
     @Test
     public void testaSoma2() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(181.0);
         stat.adicionaValor(192.0);
         stat.adicionaValor(156.0);
         stat.adicionaValor(167.0);
         stat.adicionaValor(177.0);
         
         double resultado = stat.getSoma();
         double esperado = 873.0;
         
         assertEquals(esperado,resultado,0.0);
     }
     
     @Test
     public void testaMin1() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(177.0);
         stat.adicionaValor(200.0);
         stat.adicionaValor(181.0);
         stat.adicionaValor(180.0);
         stat.adicionaValor(173.0);
         stat.adicionaValor(185.0);
         
         double resultado = stat.getMin();
         double esperado = 173.0;
         
         assertEquals(esperado,resultado,0.0);
     }
     @Test
     public void testaMin2() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(181.0);
         stat.adicionaValor(192.0);
         stat.adicionaValor(156.0);
         stat.adicionaValor(167.0);
         stat.adicionaValor(177.0);
         
         double resultado = stat.getMin();
         double esperado = 156.0;
         
         assertEquals(esperado,resultado,0.0);
     }
     @Test
     public void testaMax1() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(177.0);
         stat.adicionaValor(200.0);
         stat.adicionaValor(181.0);
         stat.adicionaValor(180.0);
         stat.adicionaValor(173.0);
         stat.adicionaValor(185.0);
         
         double resultado = stat.getMax();
         double esperado = 200.0;
         
         assertEquals(esperado,resultado,0.0);
     }
     @Test
     public void testaMax2() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(181.0);
         stat.adicionaValor(192.0);
         stat.adicionaValor(156.0);
         stat.adicionaValor(167.0);
         stat.adicionaValor(177.0);
         
         double resultado = stat.getMax();
         double esperado = 192.0;
         
         assertEquals(esperado,resultado,0.0);
     }
     @Test
     public void testaMed1() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(177.0);
         stat.adicionaValor(200.0);
         stat.adicionaValor(181.0);
         stat.adicionaValor(180.0);
         stat.adicionaValor(173.0);
         stat.adicionaValor(185.0);
         
         double resultado = stat.getMed();
         double esperado = 182.667;
         
         assertEquals(esperado,resultado,0.001);
     }
     @Test
     public void testaMed2() {
         Estatistica  stat = new Estatistica();         
         stat.adicionaValor(181.0);
         stat.adicionaValor(192.0);
         stat.adicionaValor(156.0);
         stat.adicionaValor(167.0);
         stat.adicionaValor(177.0);
         
         double resultado = stat.getMed();
         double esperado = 174.6;
         
         assertEquals(esperado,resultado,0.0);
     }
}
