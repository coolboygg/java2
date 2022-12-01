import java.sql.*;
import java.sql.ResultSet;
// import java.sql.SQLException;

public class Employee {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from employee");
            while (rs.next()) {

                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("post"));
                System.out.println(rs.getString("salary"));
            }
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
