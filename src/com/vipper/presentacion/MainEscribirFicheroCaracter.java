/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainEscribirFicheroCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer de la consola y escribir en un fichero plano
        Scanner s1 = new Scanner(System.in, "ISO-8859-1");
        try {
            //Definir el fileWriter
            FileWriter fSalida = new FileWriter("bitacora.text",true);
            while (true) {
                System.out.print("Escriba el nombre -->");
//                String nombre = s1.nextLine();
//                fSalida.write(nombre+"\n");
                    fSalida.write(s1.nextLine()+"\n");
                    System.out.println("Desea contintuar S/N");
                    String respuesta = s1.nextLine();
                    if (respuesta.equals("N")) {
                        break;
                }     
            }
            fSalida.flush(); //Envia el stream al fichero
            fSalida.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
       
        
    }
    
}
