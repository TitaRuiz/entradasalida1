/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainLeerPorCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Leer el fichero bitacora.txt, con la clase FileReader
            //El metodo read de esa clase lee caracter por caracter

            FileReader fEntrada = new FileReader("bitacora.text");
            int letra = 0;
            while ((letra = fEntrada.read()) != -1) {
                
                if (letra != 32) {
                    System.out.print((char) letra);
                }
            }
            fEntrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

}
