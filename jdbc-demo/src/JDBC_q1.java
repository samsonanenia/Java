import java.sql.*;

public class JDBC_q1 {
    public static void main(String[] args) throws SQLException {
        //Write a java program to Insert 5 records into the account table using prepared statement



        Connection connection = null;
        Statement statement = null;
        PreparedStatement stmt = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "student", "student");

            //creating statement
            System.out.println("Connection successful");
            statement = connection.createStatement();
            // insert the data

            stmt = connection.prepareStatement("insert into account values(?,?,?,?)");

                stmt.setInt(1,101);
                stmt.setString(2,"Jhon");
                stmt.setString(3,"Springfield");
                stmt.setFloat(4,35000);
            stmt.executeUpdate();
                stmt.setInt(1,102);
                stmt.setString(2,"Adam");
                stmt.setString(3,"simpson");
                stmt.setFloat(4,30000);
            stmt.executeUpdate();
                stmt.setInt(1,103);
                stmt.setString(2,"Ezana");
                stmt.setString(3,"Aman");
                stmt.setFloat(4,40000);
            stmt.executeUpdate();
                stmt.setInt(1,104);
                stmt.setString(2,"Berhe");
                stmt.setString(3,"Gebru");
                stmt.setFloat(4,19000);
            stmt.executeUpdate();
                stmt.setInt(1,105);
                stmt.setString(2,"Yonnas");
                stmt.setString(3,"Hiluf");
                stmt.setFloat(4,25000);

                stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(stmt != null){
                stmt.close();
            }
        }

    }

}

