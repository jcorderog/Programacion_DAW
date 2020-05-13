import javax.xml.stream.events.StartElement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public ADClassicModels() {
    }

    public List<Employee> getEmpleados() {

        List<Employee> employees = new ArrayList<>();

        try {
            Connection con = ConexionBD.getConnection();

            Statement se = con.createStatement();
            se.setQueryTimeout(30);

            ResultSet rs = se.executeQuery("SELECT * FROM employees");

            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("employeeNumber"),rs.getString("lastName"),
                        rs.getString("firstName"),rs.getString("extension"),rs.getString("email"),
                        rs.getString("officeCode"),rs.getInt("reportsTo"),rs.getString("jobTitle"));

                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public List<Office> getOffices() {

        List<Office> offices = new ArrayList<>();

        try {

            Connection con = ConexionBD.getConnection();

            Statement se = con.createStatement();
            se.setQueryTimeout(30);

            ResultSet rs = se.executeQuery("SELECT * FROM offices");

            while (rs.next()) {
                Office office = new Office(rs.getString("officeCode"),rs.getString("city"),rs.getString("phone"),
                        rs.getString("addressLine1"),rs.getString("addressLine2"),rs.getString("state"),
                        rs.getString("country"),rs.getString("postalCode"),rs.getString("territory"));

                offices.add(office);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return offices;
    }
}
