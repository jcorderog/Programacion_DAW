package Tareas.Tarea8_U8;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;

public interface ControlAlumnos {
    // https://my-json-server.typicode.com/chemaduran/json_entrega1/alumnos?_embed=asignaturas
    @GET("alumnos?_embed=asignaturas")
    Call<ArrayList<Alumno>> listAlumnos();
}
