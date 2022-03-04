package govindProject;
import java.sql.*;

public class conn {

	Connection c;
	Statement s;
	public conn() {
		try
		{
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","Ab@12345#");
			s=c.createStatement();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Connected");
	}

	public static void main(String[] args) {
		conn c=new conn(); 
	}

}
