import java.sql.*;

public class main {
    public static void main(String[] args) throws SQLException {

       // insertData(); //---------insert data to account -------

        // deposit(); //---------insert into transaction history --------

          showTransaction();   //----------shows the transaction history---------------

        //--------------update balance after deposit -----------

      // updateAccountDeposit(750,202);
       //---Update balance withdraw
        // updateAccountWithdraw(750,204);

        //------transfer money and record on history -----
      //  transferMoney();

        showTransferTable();

  //      withdraw();

       //--------------- this will show account table record-------------
       showAccount();

    }
    static void updateAccountDeposit(int deposit_money, int account_num) throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            String updateSQl = "update account set balance = balance + ? where account_no = ?";
            pst = co.prepareStatement(updateSQl);
            pst.setInt(1,deposit_money);
            pst.setInt(2,account_num);
            pst.executeUpdate();

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
    static void updateAccountWithdraw(int deposit_money, int account_num) throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            String updateSQl1 = "update account set balance = balance - ? where account_no = ?";
            pst = co.prepareStatement(updateSQl1);
            pst.setInt(1,deposit_money);
            pst.setInt(2,account_num);
            pst.executeUpdate();

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

    //--------------------insert data
    static void insertData() throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        // code to be executed

        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();
            //-------------------------------------------insert data ------------------------------------
            //inserting data
            Account account_1 = new Account(201, "Jhon", "Doe", 2500.00);
            String sql1 = "insert into account(account_no,first_name,last_name, balance) values (?,?,?,?)";
            pst = co.prepareStatement(sql1);
            pst.setInt(1, account_1.getAccount_no());
            pst.setString(2, account_1.getFirst_name());
            pst.setString(3, account_1.getLast_name());
            pst.setDouble(4, account_1.getBalance());
            pst.executeUpdate();

            Account account_2 = new Account(202, "Tesfay", "Kiros", 1250.00);
            String sql2 = "insert into account(account_no,first_name,last_name, balance) values (?,?,?,?)";
            pst = co.prepareStatement(sql2);
            pst.setInt(1, account_2.getAccount_no());
            pst.setString(2, account_2.getFirst_name());
            pst.setString(3, account_2.getLast_name());
            pst.setDouble(4, account_2.getBalance());
            pst.executeUpdate();

            Account account_3 = new Account(204, "Hadgu", "Kindeya", 5000.30);
            String sql3 = "insert into account(account_no,first_name,last_name, balance) values (?,?,?,?)";
            pst = co.prepareStatement(sql3);
            pst.setInt(1, account_3.getAccount_no());
            pst.setString(2, account_3.getFirst_name());
            pst.setString(3, account_3.getLast_name());
            pst.setDouble(4, account_3.getBalance());
            pst.executeUpdate();
            System.out.println("data inserted");


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

    //-------------deposit
    static void deposit() throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();
            Transaction transaction1 = new Transaction(101, "Deposit", 1000, 201);
            String sqlIn = "insert into transaction(transaction_id,transaction_type,amount, account_no) values (?,?,?,?)";
            pst = co.prepareStatement(sqlIn);

            pst.setInt(1, transaction1.getTransaction_id());
            pst.setString(2, transaction1.getTransaction());
            pst.setDouble(3, transaction1.getAmount());
            pst.setInt(4, transaction1.getAccount_no());
            pst.executeUpdate();

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

    static void withdraw() throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;


        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            Transaction transaction1 = new Transaction(102, "withdraw", 500, 201);
            String sqlIn = "insert into transaction(transaction_id,transaction_type,amount, account_no) values (?,?,?,?)";
            pst = co.prepareStatement(sqlIn);

            pst.setInt(1, transaction1.getTransaction_id());
            pst.setString(2, transaction1.getTransaction());
            pst.setDouble(3, transaction1.getAmount());
            pst.setInt(4, transaction1.getAccount_no());
            pst.executeUpdate();

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
//----------- update transfer history----------------------------------
    static void transferMoney() throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            Transfer transfer1 = new Transfer(501, 204, 202, 750,"Trip to hawaii");
            String sqlIn = "insert into transfer(transfer_id,from_account,to_account, amount, reason) values (?,?,?,?,?)";
            pst = co.prepareStatement(sqlIn);
            pst.setInt(1, transfer1.getTransfer_id());
            pst.setInt(2, transfer1.getFrom_account());
            pst.setInt(3, transfer1.getTo_account());
            pst.setDouble(4, transfer1.getAmount());
            pst.setString(5, transfer1.getReason());
            pst.executeUpdate();

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

    static void showTransferTable() throws SQLException{

        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            System.out.println("transfer_id " + "\t" + "from account" + "\t" + "to account" + "\t" + "amount"+ "\t" + "reason");
            String updateAll = "select * from transfer";
            rs = st.executeQuery(updateAll);

            while (rs.next()) {
                System.out.print(rs.getInt("transfer_id") + "\t" + "\t" + "\t" + "\t" + "\t");
                System.out.print(rs.getInt("from_account") + "\t" + "\t" + "\t");
                System.out.print(rs.getInt("to_account") + "\t" + "\t" + "\t");
                System.out.print(rs.getDouble("amount") + "\t");
                System.out.print(rs.getString("reason") + "\t");
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

    //----------print account record
    static void showAccount() throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        // code to be executed

        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            System.out.println("account_no " + "\t" + "first name" + "\t" + "last name" + "\t" + "balance");
            String updateAll = "select * from account";
            rs = st.executeQuery(updateAll);

            while (rs.next()) {
                System.out.print(rs.getInt("account_no") + "\t" + "\t" + "\t");
                System.out.print(rs.getString("first_name") + "\t" + "\t");
                System.out.print(rs.getString("last_name") + "\t" + "\t");
                System.out.println(rs.getDouble("balance") + "\t");
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
    //----------print account record
    static void showTransaction() throws SQLException {
        Connection co = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

        // code to be executed

        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_sys", "student", "student");
            st = co.createStatement();

            String sqlAll = "select * from transaction";
            rs = st.executeQuery(sqlAll);

            System.out.println("Trans ID " + "\t" + "Trans type" + "\t" + "Amount" + "\t" + "Account #");

            while (rs.next()) {
                System.out.print(rs.getInt("transaction_id") + "\t" + "\t" + "\t");
                System.out.print(rs.getString("transaction_type") + "\t" + "\t");
                System.out.print(rs.getDouble("amount") + "\t" + "\t");
                System.out.println(rs.getInt("account_no") + "\t");
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


