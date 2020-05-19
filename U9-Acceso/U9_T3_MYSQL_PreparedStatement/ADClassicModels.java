package Tarea3;

import Tarea2.ConexionBD;
import Tarea2.Employee;
import Tarea2.Office;
import jdk.nashorn.internal.ir.CatchNode;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADClassicModels {

    public ADClassicModels() {
    }

    public boolean insertCustomer() {
        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();
        System.out.println("Inserta los datos del Cliente:");
        System.out.println("Numero de Cliente: ");
        customer.setCustomerNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Nombre del Cliente: ");
        customer.setCustomerName(sc.nextLine());
        System.out.println("Apellido del contacto del Cliente: ");
        customer.setContactLastName(sc.nextLine());
        System.out.println("Nombre del contacto del Cliente: ");
        customer.setContactFirstName(sc.nextLine());
        System.out.println("Numero de Telefono del Cliente: ");
        customer.setPhone(sc.nextLine());
        System.out.println("1º Dirección del Cliente: ");
        customer.setAddressLine1(sc.nextLine());
        System.out.println("2º Dircción del Cliente: ");
        customer.setAddressLine2(sc.nextLine());
        System.out.println("Ciudad del Cliente: ");
        customer.setCity(sc.nextLine());
        System.out.println("Estado en el que está el Cliente: ");
        customer.setState(sc.nextLine());
        System.out.println("Código Postal del Cliente: ");
        customer.setPostalCode(sc.nextLine());
        System.out.println("Pais del Cliente: ");
        customer.setCountry(sc.nextLine());
        System.out.println("Numero del Empleado que le atiende del Cliente: ");
        customer.setSalesRepEmployeeNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Limite de credito del Cliente: ");
        customer.setCreditLimit(sc.nextFloat());
        sc.nextLine();

        try {
            Connection con = ConexionBD.getConnection();

            String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1, customer.getCustomerNumber());
            statement.setString(2,customer.getCustomerName());
            statement.setString(3,customer.getContactLastName());
            statement.setString(4,customer.getContactFirstName());
            statement.setString(5,customer.getPhone());
            statement.setString(6,customer.getAddressLine1());
            statement.setString(7,customer.getAddressLine2());
            statement.setString(8,customer.getCity());
            statement.setString(9,customer.getState());
            statement.setString(10,customer.getPostalCode());
            statement.setString(11,customer.getCountry());
            statement.setInt(12,customer.getSalesRepEmployeeNumber());
            statement.setFloat(13,customer.getCreditLimit());

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean asignarEmpleado () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el Número de Empelado:");
        int numEmple = sc.nextInt();
        System.out.println("Introduce el Número de Cliente:");
        int numCustom = sc.nextInt();

        try {
            Connection con = ConexionBD.getConnection();

            String sqlEmplo = "SELECT employeeNumber FROM employees WHERE employeeNumber = ?";
            PreparedStatement statement = con.prepareStatement(sqlEmplo);
            statement.setInt(1,numEmple);
            ResultSet rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Número de Empelado Incorrecto");
                System.out.println("Vuelve a introducir el Número de Empleado");
                numEmple = sc.nextInt();
                statement.setInt(1,numEmple);
                rs = statement.executeQuery();
            }

            String sqlCustom = "SELECT customerNumber FROM customers WHERE customerNumber = ?";
            statement = con.prepareStatement(sqlCustom);
            statement.setInt(1,numCustom);
            rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Número de Cliente Incorrecto");
                System.out.println("Vuelve a introducir el Número de Cliente");
                numCustom = sc.nextInt();
                statement.setInt(1,numCustom);
                rs = statement.executeQuery();
            }

            String sql = "UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numEmple);
            statement.setInt(2,numCustom);

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean anadirProductPedido () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el Código de Producto:");
        String codProduct = sc.nextLine();
        System.out.println("Introduce el Número del Pedido:");
        int numOrder = sc.nextInt();
        sc.nextLine();

        try {
            Connection con = ConexionBD.getConnection();

            String sqlProduct = "SELECT productCode FROM products WHERE productCode = ?";
            PreparedStatement statement = con.prepareStatement(sqlProduct);
            statement.setString(1,codProduct);
            ResultSet rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Código de Producto Incorrecto");
                System.out.println("Vuelve a introducir el Código de Producto");
                codProduct = sc.nextLine();
                statement.setString(1,codProduct);
                rs = statement.executeQuery();
            }

            String sqlOrder = "SELECT orderNumber FROM orders WHERE orderNumber = ?";
            statement = con.prepareStatement(sqlOrder);
            statement.setInt(1,numOrder);
            rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Número de Pedido Incorrecto");
                System.out.println("Vuelve a introducir el Número de Pedido");
                numOrder = sc.nextInt();
                statement.setInt(1,numOrder);
                rs = statement.executeQuery();
            }

            System.out.println("Introduce la cantidad del producto a añadir:");
            int cantidad = sc.nextInt();
            System.out.println("Introduce el Número de Línea del pedido(orderLineNumber): ");
            int orderLineNumber = sc.nextInt();
            System.out.println("Introduce el Precio de venta: ");
            float priceEach = sc.nextFloat();

            String sql = "INSERT INTO orderdetails VALUES (?,?,?,?,?)";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numOrder);
            statement.setString(2,codProduct);
            statement.setInt(3,cantidad);
            statement.setFloat(4,priceEach);
            statement.setInt(5,orderLineNumber);

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void mostrarPedido () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el Número de Pedido:");
        int numPedido = sc.nextInt();

        try {

            Connection con = ConexionBD.getConnection();

            String sql = "SELECT orderNumber FROM orders WHERE orderNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            ResultSet rs = statement.executeQuery();

            while (rs.next() != true) {
                System.out.println("ERROR - Número de Pedido Incorrecto");
                System.out.println("Vuelve a introducir el Número de Pedido");
                numPedido = sc.nextInt();
                statement.setInt(1,numPedido);
                rs = statement.executeQuery();
            }

            sql = "SELECT * FROM orders WHERE orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            rs.next();
            System.out.println("----------------------------");
            System.out.println("Pedido:");
            System.out.println("----------------------------");

            System.out.println("orderNumber = "+rs.getInt("orderNumber"));
            System.out.println("orderDate = "+rs.getString("orderDate"));
            System.out.println("requiredDate = "+rs.getString("requiredDate"));
            System.out.println("shippedDate = "+rs.getString("shippedDate"));
            System.out.println("status = "+rs.getString("status"));
            System.out.println("comments = "+rs.getString("comments"));
            System.out.println("customerNumber = "+rs.getInt("customerNumber"));
            System.out.println("----------------------------");
            System.out.println("Detalles:");

            sql = "SELECT * from orderdetails od INNER JOIN products p ON od.productCode = p.productCode WHERE od.orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("----------------------------");
                System.out.println("productCode = "+rs.getString("productCode"));
                System.out.println("productName = "+rs.getString("productName"));
                System.out.println("Cantidad = "+rs.getInt("quantityOrdered"));
                System.out.println("buyPrice = "+rs.getFloat("buyPrice"));
                System.out.println("PriceEach = "+rs.getFloat("priceEach"));
                System.out.println("----------------------------");
            }

            //He supuesto que el priceEach es el precio de venta del producto.

            sql = "SELECT SUM(priceEach*quantityOrdered)'Total' FROM orderdetails WHERE orderNumber = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1,numPedido);
            rs = statement.executeQuery();

            rs.next();
            System.out.println("----------------------------");
            System.out.println("Total Precio Pedido = "+ rs.getFloat("Total")+" €");
            System.out.println("----------------------------");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
