package CONNECTION;
import java.sql.*;

public class ConnectDB {
	 public static void main(String[] args) {
	        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	        String user = "pranay";
	        String pass = "06072003";

	        try {
	            // Load the Oracle JDBC driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            
	            // Establish a connection
	            Connection con = DriverManager.getConnection(url, user, pass);
	            
	            // Create a statement
	            Statement stm = con.createStatement();
	            
	            // Execute a query
	            ResultSet rs = stm.executeQuery("SELECT * FROM EMP WHERE ENAME LIKE 'S%' ");
	            
	            // Print the results
	            System.out.println("------------------Emp Detail---------------------");
	            while (rs.next()) {
	                System.out.println(
	                    rs.getInt(1) + "\t" +
	                    rs.getString(2) + "\t" +
	                    rs.getString(3) + "\t" +
	                    rs.getInt(4) + "\t" +
	                    rs.getDate(5) + "\t" +
	                    rs.getDouble(6) + "\t" +
	                    rs.getInt(7) + "\t" +
	                    rs.getInt(8)
	                );
	            }
	            
	            // Close the connection
	            con.close();
	        } catch (SQLException e) {
	            System.err.println("SQL Error: " + e.getMessage());
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            System.err.println("JDBC Driver not found: " + e.getMessage());
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
