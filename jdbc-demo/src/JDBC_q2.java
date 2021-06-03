import java.sql.*;

public class JDBC_q2 {

    public static void main(String[] args) throws SQLException {
    //Write a java program to double the balances of each record (hint update each record)

        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "student", "student");
            st = co.createStatement();
            System.out.println("Connection successful");
           // String sql = "SELECT first_name, balance, balance*2 as total_balance FROM account";
            String sql = "update account set balance = balance*2";
            st.executeUpdate(sql);

            String sqlAll = "select * from account";
            rs = st.executeQuery(sqlAll);

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

