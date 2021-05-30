import java.sql.*;

public class JDBC_q3 {
    public static void main(String[] args) throws SQLException {

        //Write a java program to retrieve all records in the ascending order of their balance and print out the first_name and balance.

        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "student", "student");

            //creating statement
            System.out.println("Connection successful");
            //creating statement
            st = co.createStatement();

            String sql = "SELECT * FROM account order by balance asc";

            rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " \t " + rs.getDouble("balance"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (co != null) {
                co.close();
            }
            if (rs != null) {
                rs.close();
            }

            if (st != null) {
                st.close();
            }

        }
    }
}