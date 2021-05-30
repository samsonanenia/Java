import java.sql.*;

public class JDBC_q4 {
    public static void main(String[] args) throws SQLException {
    //Write a java program that Calculates the total sum of the balances
    // for all accounts and print it out.
    Connection co = null;
    Statement st = null;
    ResultSet rs = null;
        try {
        int sum = 0;
        co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "student", "student");

        //creating statement
        System.out.println("Connection successful");
        //creating statement
        st = co.createStatement();

        String sql = "SELECT sum(balance) FROM account";
        rs = st.executeQuery(sql);

        while (rs.next()) {
            int c = rs.getInt(1);
            sum = sum + c;
        }
        System.out.println("Total balance is= " + sum);
    } catch (Exception e) {
        e.printStackTrace();
    }finally {
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
