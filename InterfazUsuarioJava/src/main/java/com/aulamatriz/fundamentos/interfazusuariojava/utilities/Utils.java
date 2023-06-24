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
            File archivo = new File("C:\\Users\\andrw\\Desktop\\usuarios.txt");

            // Crear el FileWriter con el archivo como parámetro
            FileWriter escritorArchivo = new FileWriter(archivo, true); // El segundo parámetro "true" indica que se agregará al archivo existente en lugar de sobrescribirlo.

            // Crear el BufferedWriter
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            // Escribir en el archivo
            bufferEscritura.write(linea);
            bufferEscritura.newLine(); // Agrega una nueva línea después de cada registro para el listado de datos.

            // Cerrar el BufferedWriter
            bufferEscritura.close();

            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
        
    }
}
