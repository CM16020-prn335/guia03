/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia3;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Kevin
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
    //Utilities instance = new Utilities();
   
    @Deployment
    public static WebArchive deploy( ){
             WebArchive salida = ShrinkWrap.create(WebArchive.class)
                      .addClass(Utilities.class).addAsWebInfResource(EmptyAsset.INSTANCE,"beans.xml");
             System.out.println(salida.toString(true));
             return salida;
      }
    
     @Inject
     private Utilities metodos;
    
     
    @Test
    public void testgetResume1() {
        String texto = "Bienvenidos a la materiade Programación 3 Ciclo II 2017";
        String textEsperado = "Bienvenidos a la mat";
        String resultado = metodos.getResume(texto);
        assertEquals(textEsperado, resultado);
     
    }
    
    @Test
    public void testgetResume2() {
        String texto = "Hola Mundo!";
        String textEsperado = "Hola Mundo!";
        String resultado = metodos.getResume(texto);
        assertEquals(textEsperado, resultado);
     
    }
    
    @Test
    public void testgetResume3() {
        String texto = null;
        String textEsperado = null;
        String resultado = metodos.getResume(texto);
        assertEquals(textEsperado, resultado);
     
    }
    
    @Test
    public void testCapitalizar1() {
        String texto = "prueBas de UNIDAD con JUnit & arQuillian";
        String textEsperado = "Pruebas De Unidad Con Junit & Arquillian";
        String resultado = metodos.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    @Test
    public void testCapitalizar2() {
        String texto = "";
        String textEsperado = "";
        String resultado = metodos.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    @Test
    public void testCapitalizar3() {
        String texto = null;
        String textEsperado = null;
        String resultado = metodos.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    @Test
    public void testcontarCoincidencias1() {
        String texto = null;
        String textEsperado = null;
        String resultado = metodos.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    

    
    
    
}
