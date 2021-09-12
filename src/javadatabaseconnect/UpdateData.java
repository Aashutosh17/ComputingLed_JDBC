package javadatabaseconnect;
import java.sql.*;
public class UpdateData {

    public static void main(String[]args) {
        // TODO Auto-generate method stub

        String url = "jdbc:mysql://localhost:3306/Demo";
        String user = "root";
        String password = "Helloworld2002";
        try{
            //Get a connection to database
            Connection myConn =DriverManager.getConnection(url,user,password);

            //Create a statement
            Statement myStmt = myConn.createStatement();

            //Execute SQL Query
            String sql = "update Userdetails set contact='harry@hotmail.com' where id=1003";

            myStmt.executeUpdate(sql);

            System.out.println("Update Completed");


        }
        catch (Exception ex ){
            ex.printStackTrace();
        }

    }
}
