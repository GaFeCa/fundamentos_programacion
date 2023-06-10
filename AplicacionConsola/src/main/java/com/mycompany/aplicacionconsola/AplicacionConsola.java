package com.mycompany.aplicacionconsola;

import com.mycompany.aplicacionconsola.matematicas.Calculadora;
import java.util.Scanner;

/**
 *
 * @author AULA304-PC6
 */
public class AplicacionConsola {

    public static void main(String[] args) {
        
        //un objeto para leer por teclado
        Scanner leerPorTeclado = new Scanner (System.in);
                
        double numero1;
        double numero2;
        double resultado;
        int opcion;
        
        System.out.println("Hola soy una calculadora");
        System.out.println("Ingresa una opcion para calcular 1. suma, 2. resta, 3. division, 4. salir");
        opcion=leerPorTeclado.nextInt();
        
        System.out.println("Ingresa numero1");
        numero1=leerPorTeclado.nextDouble();
        System.out.println("Ingresa numero2");
        numero2=leerPorTeclado.nextDouble();
        
        Calculadora calculadora = new Calculadora(numero1, numero2);
        
        if(opcion==1){
            resultado = AplicacionConsola.getSuma(numero1, numero2);
            System.out.println("resultado =" + resultado);
        }else if (opcion==2){
            resultado = AplicacionConsola. getResta (numero1, numero2);
            System.out.println("resultado =" + resultado);
        }else if (opcion==3){
            resultado = AplicacionConsola. getDivision (numero1, numero2);
            System.out.println("resultado =" + resultado);

        }else{
            System.out.println("Opcion no valida");     
        }
    }
    
                    
    public static double getSuma(double valor1 ,double valor2){
        return valor1+valor2;
    }  
    public static double getResta(double valor1 ,double valor2){
        return valor1-valor2;
    }
    public static double getDivision(double valor1 ,double valor2){
        if (valor2!=0){
            return valor1/valor2;    
        }
        return 0;
    }
    
    
}

