/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class TesteContaBancaria {
    
    public TesteContaBancaria() {
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
     public void testaCria() {
         Conta cont = new Conta();
         double valor = cont.getsaldo();
         assertEquals(0.0,valor,0.0);
     }
     
     @Test
     public void testaDep1() {
         Conta cont = new Conta();
         boolean resp = cont.depositar(50.0);
         double valor = cont.getsaldo();
         assertEquals(50.0,valor,0.0);
         assertEquals(true,resp);
     }
     @Test
     public void testaDep2() {
         Conta cont = new Conta();
         boolean resp1 = cont.depositar(50.0);
         boolean resp = cont.depositar(30.0);
         double valor = cont.getsaldo();
         assertEquals(80.0,valor,0.0);
         assertEquals(true,resp);
         assertEquals(true,resp1);
     }
     @Test
     public void testaSaque1() {
         Conta cont = new Conta();
         boolean resp = cont.depositar(30.0);
         boolean resp1 = cont.depositar(-50.0);
         double valor = cont.getsaldo();
         assertEquals(30.0,valor,0.0);
         assertEquals(true,resp);
         assertEquals(false,resp1);
     }
     
     @Test
     public void testaSaque2() {
         Conta cont = new Conta();
         boolean resp = cont.depositar(50.0);
         boolean resp1 = cont.sacar(30.0);
         double valor = cont.getsaldo();
         assertEquals(20.0,valor,0.0);
         assertEquals(true,resp);
         assertEquals(true,resp1);
     }
     @Test
     public void testaSaque3() {
         Conta cont = new Conta(0.0,1000.0);
         boolean resp = cont.depositar(10.0);
         boolean resp2 = cont.depositar(20.0);
         boolean resp1 = cont.sacar(50.0);
         double valor = cont.getsaldo();
         assertEquals(-20.0,valor,0.0);
         assertEquals(true,resp);
         assertEquals(true,resp1);
         assertEquals(true,resp2);
     }
     @Test
     public void testaCria2() {
         Conta cont = new Conta(20.0);
         boolean resp1 = cont.sacar(10.0);
         double valor = cont.getsaldo();
         assertEquals(10.0,valor,0.0);
         assertEquals(true,resp1);
     }
     @Test
     public void testaCRIA3() {
         Conta cont = new Conta(100.0,1000.0);
         boolean resp = cont.depositar(200.0);
         boolean resp1 = cont.sacar(500.0);
         assertEquals(-200.0,cont.getsaldo(),0.0);
         assertEquals(true,resp);
         assertEquals(true,resp1);
     }
     @Test
     public void testaCRIA4() {
         Conta cont = new Conta(0.0,500.0);
         boolean resp1 = cont.sacar(600.0);
         assertEquals(0.0,cont.getsaldo(),0.0);
         assertEquals(false,resp1);
     }
}
