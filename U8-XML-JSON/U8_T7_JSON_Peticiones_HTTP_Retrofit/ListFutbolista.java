package Tareas.Tarea7_U8;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ListFutbolista {

    // https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores
    @GET("jugadores")
    Call<List<Futbolista>> listFutbolistas();
}
