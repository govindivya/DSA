package govindProject;

public class PasswordValidator {

	
	public static boolean validateUserAndPassword(String username,String password) {
	 if(username.equals("Chunky") && password.equals("Cheese1")) {
		 return true;
	 }
	 return false;
	}
	public static void main(String[] args) { 
     System.out.println(validateUserAndPassword("Chunky","Cheese1"));
     System.out.println(validateUserAndPassword("Chunky","Cheese"));
	}

}
