package Tarea1;

import javax.sound.midi.Soundbank;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE state IS NULL");


            System.out.println("CUSTOMERS");
            while (rs.next()) {
                System.out.println("CustomerNumber = "+rs.getInt("customerNumber"));
                System.out.println("CustomerName = "+rs.getString("customerName"));
                System.out.println("ContactLastName = "+rs.getString("contactLastName"));
                System.out.println("City = "+rs.getString("city"));
                System.out.println("State = "+rs.getString("state"));
                System.out.println();
            }

            System.out.println("---------------------------------------------------");
            System.out.println("PAYMENTS");
            ResultSet rspayment = statement.executeQuery("SELECT * FROM payments WHERE amount > 30000");
            while (rspayment.next()) {
                System.out.println("CustomerNumber = "+rspayment.getInt("customerNumber"));
                System.out.println("CheckNumber = "+rspayment.getString("checkNumber"));
                System.out.println("PaymentDate = "+rspayment.getString("paymentDate"));
                System.out.println("Amount = "+rspayment.getInt("amount"));
                System.out.println();
            }

            System.out.println("---------------------------------------------------");
            System.out.println("EMPLOYEES");
            ResultSet rsemployee = statement.executeQuery("SELECT * FROM employees WHERE reportsTo = 1143");
            while (rsemployee.next()) {
                System.out.println("EmployeeNumber = "+rsemployee.getInt("employeeNumber"));
                System.out.println("LastName = "+rsemployee.getString("lastName"));
                System.out.println("FirstName = "+rsemployee.getString("firstName"));
                System.out.println("ReportsTo = "+rsemployee.getInt("reportsTo"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
          try {
              if (connection != null) {
                  connection.close();
              }
          } catch (SQLException e) {
              System.out.println(e.getMessage());
          }
        }
    }
}
