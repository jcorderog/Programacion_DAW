import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Office> offices = new ArrayList<>();

        ADClassicModels acm = new ADClassicModels();

        employees = (ArrayList<Employee>) acm.getEmpleados();
        offices = (ArrayList<Office>) acm.getOffices();

        System.out.println("EMPLEADOS:");
        System.out.println(employees);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("OFICINAS:");
        System.out.println(offices);

        ConexionBD.close();
    }
}
