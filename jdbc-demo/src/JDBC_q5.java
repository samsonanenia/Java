import java.sql.*;

public class JDBC_q5 {

    public static void main(String[] args) throws SQLException {

        //Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.
        //Example:	‘Highest Balance: john, Doe, 9500
        //‘Lowes Balance:  dave, james, 1500

        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "student", "student");

            //creating statement
            System.out.println("Connection successful");
            //creating statement
            st = co.createStatement();

            String sqlASC = "SELECT * FROM account ORDER BY balance ASC LIMIT 1";
            rs = st.executeQuery(sqlASC);
            //(first_name, last_name and balance)
            while (rs.next()) {
                System.out.println("Lowes Balance: " + rs.getString("first_name") + ", " + rs.getString("last_name") + ", " + rs.getDouble("balance"));
            }
            String sqlDESC = "SELECT * FROM account ORDER BY balance DESC LIMIT 1";
            rs = st.executeQuery(sqlDESC);
            while (rs.next()) {
                System.out.println("Highest Balance: " + rs.getString("first_name") + ", " + rs.getString("last_name") + ", " + rs.getDouble("balance"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
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
