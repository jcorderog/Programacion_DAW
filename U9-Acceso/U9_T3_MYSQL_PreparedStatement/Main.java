package Tarea3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡¡BIENVENIDO A LA BASE DE DATOS CLASSICMODELS!!");
        System.out.println();

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("MENU:");
            System.out.println("----------------------------------");
            System.out.println("1.Insertar Cliente");
            System.out.println("2.Asignar Empleado a Cliente");
            System.out.println("3.Añadir Producto a Pedido");
            System.out.println("4.Mostrar con Detalle un Pedido");
            System.out.println("5.Salir de la Aplicación");

            System.out.println("----------------------------------\n ELIGE UNA OPCIÓN:");

            opcion = sc.nextInt();
            if (opcion <= 0 || opcion > 5) {
                System.out.println();
                System.out.println("ERROR - Las opciones son de la 1 a la 5.");
                System.out.println();
            }
            ADClassicModels adc = new ADClassicModels();
            switch (opcion) {
                case 1:
                    adc.insertCustomer();
                    break;
                case 2:
                    adc.asignarEmpleado();
                    break;
                case 3:
                    adc.anadirProductPedido();
                    break;
                case 4:
                    adc.mostrarPedido();
                    break;
            }
        }
        ConexionBD.close();
    }
}
