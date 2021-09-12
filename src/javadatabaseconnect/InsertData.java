package javadatabaseconnect;
import java.sql.*;
public class InsertData {

    public static void main(String[]args) {
        // TODO Auto-generate method Stub
        String url = "jdbc:mysql://localhost:3306/Demo";
        String user = "root";
        String password = "Helloworld2002" ;

        try{
            //Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user,password);

            // Create a statement
            Statement myStmt = myConn.createStatement();

            //Execute SQl query
            String sql = "insert into Userdetails"
                    +"(Name,Address,contact)"
                    +"values('Elon','Sanfrancisco','ElonM17@gmail.com')";

            myStmt.executeUpdate(sql);
            System.out.println("Insert Completed");

        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
