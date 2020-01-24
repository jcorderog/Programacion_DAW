package PruebaEntregable;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pedidos {
    private Pizza p;
    private Calendar momento;

    public Pedidos (Pizza pizza) {
        this.p = pizza;
        this.momento = Calendar.getInstance();
    }
    public Pedidos (){
        this.p = new Pizza();
        Ingrediente ing1 = new Ingrediente();
        Ingrediente ing2 = new Ingrediente("Jamón", 300);
        this.p.setIngrediente(ing1);
        this.p.setIngrediente(ing2);
        this.momento = Calendar.getInstance();
    }

    public void mostrarPedido (){
        p.mostrarInfoPizza();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha Pedido: "+dateFormat.format(this.momento));
    }
}
