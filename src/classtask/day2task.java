package classtask;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class day2task {

	private static final String URL = null;
	private static final String USER = null;
	private static final String PASSWORD = null;

	public static void main(String[] args) {
	 final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // Update with your DB details
	  final String USER = "your_username"; // Replace with your DB username
     final String PASSWORD = "your_password"; // Replace with your DB password
		
	//        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	  //      String user = "pranay";
	     //    String pass = "06072003";
//
	        try (Scanner scanner = new Scanner(System.in)) {
	            while (true) {
	                System.out.println("\nChoose an operation:");
	                System.out.println("1. Add Product");
	                System.out.println("2. View All Products");
	                System.out.println("3. View Product By Code");
	                System.out.println("4. Exit");
	                System.out.print("Enter your choice: ");
	                int choice = scanner.nextInt();
	                scanner.nextLine(); // Consume newline

	                switch (choice) {
	                    case 1:
	                        addProduct(scanner);
	                        break;
	                    case 2:
	                        viewAllProducts();
	                        break;
	                    case 3:
	                        viewProductByCode(scanner);
	                        break;
	                    case 4:
	                        System.out.println("Exiting application.");
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void addProduct(Scanner scanner) {
	        System.out.print("Enter product code: ");
	        String code = scanner.nextLine();
	        System.out.print("Enter product name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter product price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Enter product quantity: ");
	        int qty = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        String sql = "INSERT INTO Product70 (code, name, price, qty) VALUES (?, ?, ?, ?)";

	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setString(1, code);
	            pstmt.setString(2, name);
	            pstmt.setDouble(3, price);
	            pstmt.setInt(4, qty);

	            int rowsInserted = pstmt.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Product added successfully.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error adding product: " + e.getMessage());
	        }
	    }

	    private static void viewAllProducts() {
	        String sql = "SELECT * FROM Product70";

	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            System.out.println("\nProduct List:");
	            System.out.println("Code\tName\t\tPrice\tQty");
	            while (rs.next()) {
	                System.out.printf("%s\t%s\t\t%.2f\t%d\n", rs.getString("code"), rs.getString("name"), rs.getDouble("price"), rs.getInt("qty"));
	            }
	        } catch (SQLException e) {
	            System.out.println("Error fetching products: " + e.getMessage());
	        }
	    }

	    private static void viewProductByCode(Scanner scanner) {
	        System.out.print("Enter product code: ");
	        String code = scanner.nextLine();

	        String sql = "SELECT * FROM Product70 WHERE code = ?";

	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setString(1, code);
	            try (ResultSet rs = pstmt.executeQuery()) {
	                if (rs.next()) {
	                    System.out.println("\nProduct Details:");
	                    System.out.printf("Code: %s\nName: %s\nPrice: %.2f\nQuantity: %d\n",
	                            rs.getString("code"), rs.getString("name"), rs.getDouble("price"), rs.getInt("qty"));
	                } else {
	                    System.out.println("No product found with code: " + code);
	                }
	            }
	        } catch (SQLException e) {
	            System.out.println("Error fe"
	            		+ ""
	            		+ ""
	            		+ ""
	            		+ ""
	            		+ "tching product: " + e.getMessage());
	        }
	}

}
