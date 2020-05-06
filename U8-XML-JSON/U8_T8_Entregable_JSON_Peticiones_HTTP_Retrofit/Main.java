package Tareas.Tarea8_U8;

import Tareas.Tarea7_U8.Futbolista;
import Tareas.Tarea7_U8.ListFutbolista;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ControlAlumnos service = retrofit.create(ControlAlumnos.class);
        Alumno alumno = null;

        System.out.println("Listado completo de Alumnos:");
        try {
            Response<ArrayList<Alumno>> response = service.listAlumnos().execute();
            if (response.isSuccessful()) {
                List<Alumno> alumnos = response.body();
                System.out.println(alumnos);
            } else {
                System.out.println("Petición no valida "+ response.message());
            }
        } catch (IOException i) {
            System.out.println(i.getMessage());
        }
    }
}
