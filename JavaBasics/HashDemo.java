package govindProject;
import java.util.*;

public class HashDemo <S,T>{
	 
	int len;
	ArrayList<String> Hash[];
    
	public HashDemo( int lenght) {
		len=0;
		Hash=new ArrayList[lenght];
		for(int i=0;i<lenght;i++) {
			Hash[i]=new ArrayList<String>();
		}
	}
    public void Hash(String str) {
    	 int key=0;
         char arr[]=str.toCharArray();
         for(int i=0;i<arr.length;i++) {
        	 key=(int)arr[i]*i*i+key;
         }
         key=key%this.Hash.length-1;
         this.Hash[key].add(str);
     	System.out.println(key);
     	
         
       }
    public boolean isContained(String str) {
    	int key=0;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
       	 key=(int)arr[i]*i*i+key*i*i;
        }
        key=key%this.Hash.length-1;
        return Hash[key].contains(str);
    	
      
        
    }
    public int getKey(String str) {
    	int key=0;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
       	 key=(int)arr[i]*i*i+key*i*i;
        }
        key=key%this.Hash.length-1;
        return key;
    	
    }
	public static void main(String[] args) {
		HashDemo s=new HashDemo(60);
		s.Hash("Ranjan");		
		s.Hash("Ramyan");
		s.Hash("bilan");
		s.Hash("niraj");
		s.Hash("Shiavni");
		s.Hash("Ranjan");
		s.Hash("Ranjan");
	    Iterator it=s.Hash[s.getKey("Ranjan")].iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());
	   
//		System.out.println(s.Hash.length);

	}

}
