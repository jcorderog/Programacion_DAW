package Tareas.Tarea5_U8;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        ArrayList<Futbolista> futbolistas = new ArrayList<>();

        futbolistas.add(new Futbolista(1,"Casillas","Real Madrid"));
        futbolistas.get(0).addPosicion("Portero");
        futbolistas.add(new Futbolista(15,"Ramos","Real Madrid"));
        futbolistas.get(1).addPosicion("Lateral derecho");
        futbolistas.get(1).addPosicion("Medio Centro");
        futbolistas.add(new Futbolista(3,"Pique","FC Barcelona"));
        futbolistas.get(2).addPosicion("Central");
        futbolistas.add(new Futbolista(5,"Puyol","FC Barcelona"));
        futbolistas.get(3).addPosicion("Central");
        futbolistas.add(new Futbolista(11,"Capdevila","Villareal"));
        futbolistas.get(4).addPosicion("Lateral izquierdo");
        futbolistas.add(new Futbolista(14,"Xabi Alonso","Real Madrid"));
        futbolistas.get(5).addPosicion("Defensa medioCampo");
        futbolistas.get(5).addPosicion("Mediocampo");
        futbolistas.add(new Futbolista(16,"Busquets","FC Barcelona"));
        futbolistas.get(6).addPosicion("Defensa medioCampo");
        futbolistas.add(new Futbolista(8,"Xavi Hernandez","FC Barcelona"));
        futbolistas.get(7).addPosicion("Mediocampo");
        futbolistas.add(new Futbolista(18,"Pedrito","FC Barcelona"));
        futbolistas.get(8).addPosicion("Extremo izquierdo");
        futbolistas.get(8).addPosicion("Falso extremo");
        futbolistas.add(new Futbolista(6,"Iniesta","FC Barcelona"));
        futbolistas.get(9).addPosicion("Extremo derecho");
        futbolistas.get(9).addPosicion("Mediocampo");
        futbolistas.add(new Futbolista(7,"Villa","FC Barcelona"));
        futbolistas.get(10).addPosicion("Delantero centro");

        String futbolistasJSON = gson.toJson(futbolistas);
        System.out.println(futbolistasJSON);
    }
}
