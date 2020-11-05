/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retroit;

import java.util.ArrayList;

/**
 *
 * @author FP Mañana A
 */
public class PintaHTML {

    

    static String crearTabla() {
        ArrayList<Estacion> lista_datos=new ArrayList<>();
        String html="<html><head></head><body><table>";
        for(Estacion x : lista_datos){
            html=html+"<tr><td>"+x.getEstacion_analizador_NO2()+"</td><td>"+x.getEstacion_analizador_SO2()+"</td><td>"+x.getEstacion_direccion_postal()+"</td><td>"+x.getEstacion_municipio()+"</td></tr>";
        }
        html=html+"</table></body></html>";
        return html;       
    }
    
    
    
}
