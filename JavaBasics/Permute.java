package govindProject;

public class Permute {
	
   public static String swap(String str,int i,int j)
   {
	 char c1=str.charAt(i);
	 char c2=str.charAt(j);
	 char[] ch=str.toCharArray();
	 ch[i]=c2;
	 ch[j]=c1;
	 str=String.copyValueOf(ch);
			 
	  
	  return str;
   }
  public static void permute(String str,int l,int r)
  {
	 if(l==r)
		 System.out.println(str);
	  for(int i=l;i<=r;i++)
	  { 
		  str=swap(str,l,i);
		  permute(str,l+1,r);
		  str=swap(str,l,i);
	  }
		  
   }

	public static void main(String[] args) {
		 
		String str="ABCDEFGH";
		permute(str,0,4);
//		System.out.println(swap(str,1,4));
	}

}
