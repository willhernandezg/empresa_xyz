package com.example.android.empresa_xyz;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {

//PRIMERO
    public static double total_masculino_zapatillas_nike(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==0 && tipo==0 && marca==0)
            res = cant*120000;
        return res;
    }

    public static double total_masculino_zapatillas_adidas(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==0 && tipo==0 && marca==1)
            res = cant*140000;
        return res;
    }

    public static double total_masculino_zapatillas_puma(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==0 && tipo==0 && marca==2)
            res = cant*130000;
        return res;
    }

//SEGUNDO
    public static double total_masculino_clasico_nike(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==0 && tipo==1 && marca==0)
            res = cant*50000;
        return res;
    }

    public static double total_masculino_clasico_adidas(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==0 && tipo==1 && marca==1)
            res = cant*80000;
        return res;
    }

    public static double total_masculino_clasico_puma(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==0 && tipo==1 && marca==2)
            res = cant*100000;
        return res;
    }

//TERCERO
    public static double total_femenino_zapatillas_nike(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==1 && tipo==0 && marca==0)
            res = cant*100000;
        return res;
    }

    public static double total_femenino_zapatillas_adidas(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==1 && tipo==0 && marca==1)
            res = cant*130000;
        return res;
    }

    public static double total_femenino_zapatillas_puma(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==1 && tipo==0 && marca==2)
            res = cant*110000;
        return res;
    }

//CUARTO
    public static double total_femenino_clasico_nike(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==1 && tipo==1 && marca==0)
            res = cant*60000;
        return res;
    }

    public static double total_femenino_clasico_adidas(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==1 && tipo==1 && marca==1)
            res = cant*70000;
        return res;
    }

    public static double total_femenino_clasico_puma(int sexo, double tipo, int marca, int cant){
        double res = 0;
        if (sexo==1 && tipo==1 && marca==2)
            res = cant*120000;
        return res;
    }



}
