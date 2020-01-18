package PruebaEntregable;

public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza(Pizza.Size.FAMILIAR);
        Ingrediente ing1 = new Ingrediente("Piña", 100);
        Ingrediente ing2 = new Ingrediente("Champiñon", 150);
        Ingrediente ing3 = new Ingrediente("Oregano", 200);


        p.setIngrediente(ing1);
        p.setIngrediente(ing3);
        p.setIngrediente(ing2);

        System.out.println(p.getNumIngre());

        p.mostrarInfoPizza();

        Pedidos pedido = new Pedidos();

        pedido.mostrarPedido();
    }
}
