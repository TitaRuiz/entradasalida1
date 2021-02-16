/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainLeerBufferdReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Leer el fichero bitacora.txt, con la clase FileReader, añadimos el uso de la clase BufferedReader
            //El metodo read de esa clase lee caracter por caracter
            
            FileReader fEntrada = new FileReader("bitacora.text");
            BufferedReader buffer = new BufferedReader(fEntrada);
            String cadena;
            while ((cadena = buffer.readLine())!=null) {
                
                System.out.println(cadena);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
