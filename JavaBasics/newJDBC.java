package govindProject;
import java.sql.*;

public class newJDBC {
    
	
	
	public newJDBC() {
		
		
	}

	public static void main(String[] args) throws SQLException {
		
		
		 
			Connection conn=DriverManager.getConnection("jdbc:mysql://locallhost:3306/teachers_details",
					"root","Ab@12345#");
			Statement st=conn.createStatement();
	 
	 
		
	}

}
