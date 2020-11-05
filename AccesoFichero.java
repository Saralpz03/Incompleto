/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retroit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP Mañana A
 */
public class AccesoFichero {
    

    public static ArrayList<Estacion> escribirHTML() {
        ArrayList<Estacion> lista_datos=new ArrayList<>();
        String ruta="C:\\Users\\FP Mañana A\\Desktop\\CLase\\NetBeans\\sara\\sara.html";
        try {
            FileWriter fw=new FileWriter(ruta);
            String linea="";
            String html="<html><head><body>";
            while ((linea=fr.readLine()) != null) {                
                PintaHTML.crearTabla();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista_datos;
        
    }
}
