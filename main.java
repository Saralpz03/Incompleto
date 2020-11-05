/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retroit;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author FP Mañana A
 */
public class main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("http://datos.comunidad.madrid/").addConverterFactory(GsonConverterFactory.create())
        .build();
        
        ServicioContaminacion service = retrofit.create(ServicioContaminacion.class);
        Call<Datos> datos=service.recuperarDtaos();
        datos.enqueue(new Callback<Datos>() {
            @Override
            public void onResponse(Call<Datos> call, Response<Datos> rspns) {
                Datos d=rspns.body();
                AccesoFichero.escribirHTML();
                System.out.println("Datos: "+d);
                String lista_datos=PintaHTML.crearTabla();
                
            }

            @Override
            public void onFailure(Call<Datos> call, Throwable thrwbl) {
                System.out.println("Huo un problema: "+thrwbl.getMessage());
            }
        });
    }
}
