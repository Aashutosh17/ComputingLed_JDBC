package javadatabaseconnect;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Driver {

    public static void main(String[]args){
        // TODO Auto-generate method Stub

        try{
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","Helloworld2002");

            // 2. Create a statement
             Statement myState = myConn.createStatement();

            // Execute SQL query
            ResultSet myRs = myState.executeQuery("Select * from Userdetails");

            // Process the result set
            while(myRs.next()) {
                System.out.println(myRs.getString("Name")+","+myRs.getString("Address"));
            }
        }
        catch(Exception exc) {
            exc.printStackTrace();
        }
    }
}
