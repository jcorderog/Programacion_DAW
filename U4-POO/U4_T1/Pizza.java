package PruebaEntregable;

public class Pizza {
    public enum Size {MEDIANA, FAMILIAR}
    private Size tamano;
    private int numIngre = 0;
    private Ingrediente[] ingrediente;

    public Pizza(Size tamano) {
        this.tamano = tamano;
        this.ingrediente = new Ingrediente[3];
    }

    public Pizza(){
        this.tamano = Size.FAMILIAR;
        this.ingrediente = new Ingrediente[3];
    }

    public int getNumIngre() {
        return numIngre;
    }

    public boolean setIngrediente(Ingrediente ingre) {
        if (this.numIngre < 3){
            this.ingrediente[numIngre] = ingre;
            this.numIngre++;
            return true;
        }
        return false;
    }

    public void mostrarInfoPizza (){
        System.out.print("Pizza "+this.tamano+" con "+this.ingrediente[0].getNombre());
        for (int i = 0; i < numIngre; i++) {
            if (i == 1 && numIngre == 3){
                System.out.print(", "+this.ingrediente[i].getNombre());
            } else if (i == 2 || (i==1 && numIngre==2) ){
                System.out.print(" y "+this.ingrediente[i].getNombre());
            }
        }
        System.out.println();
    }
}
