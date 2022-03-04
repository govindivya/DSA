package govindProject;

public class Prime {
	public static void main(String args []) {
		for(int i=2;i<30;i++) {
			boolean check=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					check=false;
			}
			
			if(check==true)
					System.out.println(i);
		}
	}

}
