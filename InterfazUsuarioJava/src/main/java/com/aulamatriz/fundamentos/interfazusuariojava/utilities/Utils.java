/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulamatriz.fundamentos.interfazusuariojava.utilities;

import com.aulamatriz.fundamentos.interfazusuariojava.abstraccion.Usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Utils {
    public static void guardarUsuario(Usuario usuario){
        try {
           String linea = usuario.getName()+";"+ usuario.getLastname()+";"+usuario.getDocumentNumber()+";"+usuario.getDocumentType();
            File archivo = new File("C:\\Users\\AULA304-PC6\\Desktop\\usuarios.txt");

            // Crear el FileWriter con el archivo como parámetro
            FileWriter escritorArchivo = new FileWriter(archivo);

            // Crear el BufferedWriter
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            // Escribir en el archivo
            bufferEscritura.write(linea);

            // Cerrar el BufferedWriter
            bufferEscritura.close();

            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
        
    }
}
