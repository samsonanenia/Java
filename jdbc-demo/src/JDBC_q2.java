import java.sql.*;

public class JDBC_q2 {

    public static void main(String[] args) throws SQLException {
    //Write a java program to double the balances of each record (hint update each record)

        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "student", "student");

            System.out.println("Connection successful");
            String sql = "SELECT balance*2 FROM account";

            rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " \t " + rs.getDouble("balance"));
            }

        }catch (Exception e) {
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
