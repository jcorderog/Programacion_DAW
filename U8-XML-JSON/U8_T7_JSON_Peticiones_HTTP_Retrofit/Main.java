package Tareas.Tarea7_U8;

import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ListFutbolista service = retrofit.create(ListFutbolista.class);
        Futbolista futbolista = null;

        System.out.println("Listado completo de Jugadores:");
        try {
            Response<List<Futbolista>> response = service.listFutbolistas().execute();
            if (response.isSuccessful()) {
                List<Futbolista> futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Petición no valida "+ response.message());
            }
        } catch (IOException i) {
            System.out.println(i.getMessage());
        }

    }
}
