package classtask;
import java.util.*;

import java.sql.*;
public class Lab_task1 {

	public static void main(String[] args) {
	
	 String url = "jdbc:oracle:thin:@localhost:1521:orcl";
     String user = "pranay";
     String pass = "06072003";

     try(Scanner rd=new Scanner(System.in)) {
         // Load the Oracle JDBC driver
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         // Establish a connection
         Connection con = DriverManager.getConnection(url, user, pass);
         
         Statement stm=con.createStatement();
         
         while(true) {
        	 System.out.println("----------Operation choice..............");
        	 System.out.println("1.Insert DATA");
        	 System.out.println("2.Update DATA");
        	 System.out.println("3.Search by First letter");
        	 System.out.println("4.cont Number of employee");
        	 System.out.println("5.delete DATA using ID");
        	 System.out.println("6.Show all employee");
        	 System.out.println("7 __EXIT__");
        	 
        	 System.out.println("Enter your choice:");
        	 int choice=rd.nextInt();
        	 rd.nextLine();
        	 
        	switch(choice) {
        	case 1:
        		System.out.print("Enter EMP_ID: ");
                int empid = rd.nextInt();
                rd.nextLine();
                System.out.print("Enter EMP name: ");
                String name = rd.nextLine();
                System.out.print("Enter EMP salary: ");
                double sal = rd.nextDouble();
                rd.nextLine();
                System.out.print("Enter EMP Address: ");
                String add = rd.nextLine();
                
                System.out.println("Enter email:");
                String mail=rd.nextLine();
                System.out.println("Enter phoneno:");
                long pnum = rd.nextLong();
                rd.nextLine();
               // rd.close();
                String insertq="INSERT INTO  EMPLOYEE_INFO(EMPID, EMPNAME, EMPSALARY, EMPADDRESS,EMPMAILID,EMPPHNO) VALUES (?,?,?,?,?,?)";
                try(PreparedStatement pst=con.prepareStatement(insertq)){
                	pst.setInt(1, empid);
                	pst.setString(2, name);
                	pst.setDouble(3, sal);
                	pst.setString(4, add);
                	pst.setString(5, mail);
                	pst.setLong(6, pnum);
                	int rows = pst.executeUpdate();
                	if(rows>0) System.out.println("\n Data Added ");
                	else System.out.println("\nData fail to Add");
                		}
                 break;
        	case 7:
        		System.out.println("Exiting application.");
        		return;
        	default :
        		System.out.println("Enter Valid choice....");
        		
        	}
        	 }
		
		
	}catch(Exception e) {
		e.printStackTrace();
	 
	}

}
	
}