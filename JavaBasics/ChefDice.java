package govindProject;

public class ChefDice {

	public static long calculatePill(long N) {
	 
	    if(N==0)
	    	return 0;
		if(N==1)
			return 20;
		if(N==2)
			return 36;
		if(N==3)
			return 51;
		if(N==4)
			return 60;
	    if(N==5)
	    	return 76;
	    if(N==6)
	    	return 88;
	    if(N==7)
	    	return 95;
	    if(N==8)
	    	return 100;
	    long factor=(int)Math.ceil(N/4.0);

	    long newN=N-(factor-2)*4;
	    return (factor-2)*44+calculatePill(newN);
	    
	    
	 }
	
	
	
	public static void main(String[] args) {
		System.out.println(calculatePill(189));
		
	}

}
