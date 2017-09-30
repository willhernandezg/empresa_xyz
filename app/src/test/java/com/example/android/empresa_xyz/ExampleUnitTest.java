package com.example.android.empresa_xyz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

//HOMBRES
    @Test
    public void masculino_zapatillas_nike_correcto() {
        assertEquals(360000,Metodos.total_masculino_zapatillas_nike(0,0,0,3),0);
    }

    @Test
    public void masculino_zapatillas_nike_incorrecto() {
        assertNotEquals(360000,Metodos.total_masculino_zapatillas_nike(0,0,0,2),0);
    }

    @Test
    public void masculino_zapatillas_adidas_correcto() {
        assertEquals(280000,Metodos.total_masculino_zapatillas_adidas(0,0,1,2),0);
    }

    @Test
    public void masculino_zapatillas_adidas_incorrecto() {
        assertNotEquals(360000,Metodos.total_masculino_zapatillas_adidas(0,0,1,2),0);
    }

    @Test
    public void masculino_zapatillas_puma_correcto() {
        assertEquals(390000,Metodos.total_masculino_zapatillas_puma(0,0,2,3),0);
    }

    @Test
    public void masculino_zapatillas_puma_incorrecto() {
        assertNotEquals(360000,Metodos.total_masculino_zapatillas_puma(0,0,2,2),0);
    }


    @Test
    public void masculino_clasico_nike_correcto() {
        assertEquals(150000,Metodos.total_masculino_clasico_nike(0,1,0,3),0);
    }

    @Test
    public void masculino_clasico_nike_incorrecto() {
        assertNotEquals(360000,Metodos.total_masculino_clasico_nike(0,1,0,2),0);
    }

    @Test
    public void masculino_clasico_adidas_correcto() {
        assertEquals(160000,Metodos.total_masculino_clasico_adidas(0,1,1,2),0);
    }

    @Test
    public void masculino_clasico_adidas_incorrecto() {
        assertNotEquals(360000,Metodos.total_masculino_clasico_adidas(0,1,1,2),0);
    }

    @Test
    public void masculino_clasico_puma_correcto() {
        assertEquals(300000,Metodos.total_masculino_clasico_puma(0,1,2,3),0);
    }

    @Test
    public void masculino_clasico_puma_incorrecto() {
        assertNotEquals(360000,Metodos.total_masculino_clasico_puma(0,1,2,2),0);
    }

//MUJERES
    @Test
    public void femenino_zapatillas_nike_correcto() {
        assertEquals(300000,Metodos.total_femenino_zapatillas_nike(0,0,0,3),0);
    }

    @Test
    public void femenino_zapatillas_nike_incorrecto() {
        assertNotEquals(360000,Metodos.total_femenino_zapatillas_nike(0,0,0,2),0);
    }

    @Test
    public void femenino_zapatillas_adidas_correcto() {
        assertEquals(260000,Metodos.total_femenino_zapatillas_adidas(0,0,1,2),0);
    }

    @Test
    public void femenino_zapatillas_adidas_incorrecto() {
        assertNotEquals(360000,Metodos.total_femenino_zapatillas_adidas(0,0,1,3),0);
    }

    @Test
    public void femenino_zapatillas_puma_correcto() {
        assertEquals(330000,Metodos.total_femenino_zapatillas_puma(0,0,2,3),0);
    }

    @Test
    public void femenino_zapatillas_puma_incorrecto() {
        assertNotEquals(360000,Metodos.total_femenino_zapatillas_puma(0,0,2,2),0);
    }


    @Test
    public void femenino_clasico_nike_correcto() {
        assertEquals(180000,Metodos.total_femenino_clasico_nike(0,1,0,3),0);
    }

    @Test
    public void femenino_clasico_nike_incorrecto() {
        assertNotEquals(360000,Metodos.total_femenino_clasico_nike(0,1,0,2),0);
    }

    @Test
    public void femenino_clasico_adidas_correcto() {
        assertEquals(140000,Metodos.total_femenino_clasico_adidas(0,1,1,2),0);
    }

    @Test
    public void masculino_femenino_adidas_incorrecto() {
        assertNotEquals(360000,Metodos.total_femenino_clasico_adidas(0,1,1,2),0);
    }

    @Test
    public void femenino_clasico_puma_correcto() {
        assertEquals(360000,Metodos.total_femenino_clasico_puma(0,1,2,3),0);
    }

    @Test
    public void femenino_clasico_puma_incorrecto() {
        assertNotEquals(410000,Metodos.total_femenino_clasico_puma(0,1,2,2),0);
    }

}