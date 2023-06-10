/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionconsola.matematicas;

/**
 *
 * @author AULA304-PC6
 */
public class Calculadora {
    
    /**
     * Atributos
     */
    
    private double operacion1;
    
    private double operacion2;
    
    /**
     * Constructor
     */
    public Calculadora(double operacion1, double operacion2) {
        this.operacion1 = operacion1;
        this.operacion2 = operacion2;
    }   
    
    
    /**
     * Metodos
     */
    
    public double getSuma(){
        return this.operacion1+this.operacion2;
    }
    public double getResta(){
        return this.operacion1-this.operacion2;
    }
    
    public void getDivision(){
        try {
        double resultado =operacion1/this.operacion2;
        System.out.println("el resultado de la division es" +resultado);
        
        } catch (Exception e) {
            System.err.println("No se puede dividir por 0");
            System.err.println(e.getMessage());
        }
        
    }
}

