package govindProject;

public class Prefix {
	 

public static void preSolve(String str)
{
	stack st=new stack(str.length());
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch=str.charAt(i);
		if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
		{
			st.push((int)ch);
		}
		else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
		{
		    int  num1=asciiToInt((int)st.pop());
			int num2= asciiToInt((int)st.pop());
			System.out.println(num1+"  "+num2);
			switch(ch)
			{
			case '+' :
			{
				int num3=num1+num2;
				st.push(num3);
				break;
			}
			case '-' :
			{
				int num3=num1-num2;
				st.push(num3);
				break;
			}
			case '*' :
			{
				int num3=num1*num2;
				st.push(num3);
				break;
			}
			case '/' :
			{
				int num3=num1/num2;
				st.push(num3);
				break;
			}
			default:
				System.out.println("Invalid Expression");
			
			}
			
		}
		else
			System.out.println("Invalid Expression");
			
	}
	System.out.println(st.pop());
}
public static int asciiToInt(int num){
	switch(num)
	{
	case 48:
	{
		return 0;
	}
	case 49:
	{
		return 1;
	}
	case 50:
	{
		return 2;
	}
	case 51:
	{
		return 3;
	}
	case 52:
	{
		return 4;
	}
	case 53:
	{
		return 5;
	}
	case 54:
	{
		return 6;
	}
	case 55:
	{
		return 7;
	}
	case 56:
	{
		return 8;
	}
	case 57:
	{
		return 9;
	}
	default:
		return Integer.MIN_VALUE;
	}
	 
	
}
	
public static void main(String[] args) {
	String str="*+236";
//	int num=Integer.valueOf(str);
//	System.out.println(num*2);
   preSolve(str);
 
	
	
	}


}
