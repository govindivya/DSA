package govindProject;

public class Crypto {
 public static  String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,one,two,three,four,five,six,seven,eight,nine,zero,
 atrate,comma,
 hash;
 
	
	public Crypto() {
		a=".1a";
		b="1.z";
		c="..b";
		d=".2a";
		e="2.b";
		f="22c";
		g=".3i";
		h="3.d";
		i="33e";
		j="4.e";
		k=".4f";
		l="449";
		m="5.m";
		n="..k";
		o="!6l";
		p="!!n";
		q="!!p";
		r="66q";
		s="!7t";
		t="..!";
		u="77w";
		v=".v7";
		w="7.v";
		x=".8.";
		y="8.x";
		z="88s";
		one="11p";
		two="!2r";
		three="23p";
		four="4!q";
		five="45o";
		six=".6n";
		seven="...";
		eight="!!!";
		nine="8!t";
		zero="00a";
		atrate="@..";
		comma="!,!";
		hash="###";
		
		
	}
	public  String crypto(String str) {   // encrypting given string**
		StringBuilder myStr=new StringBuilder("");
	 char ch[]=str.toCharArray();
	   for(int i=0;i<ch.length;i++) {
		  switch(ch[i]){
		  case 'a':{
			  myStr=myStr.append(this.a);
			  break;
		  }
			
		  case 'b':{
			  myStr=myStr.append(this.b);
			  break;
		  }
		 
		  
		  case 'c':{
			  myStr=myStr.append(this.c);
			  break;
		  }
			
		  case 'd':{
			  myStr=myStr.append(this.d);
			  break;
		  }
			  
		  case 'e':{
			  myStr=myStr.append(this.e);
			  break;
		  }
			
		  case 'f':{
			  myStr=myStr.append(this.f);
			  break;
		  }
			  
		  case 'g':{
			  myStr=myStr.append(this.g);
			  break;
		  }
			
		  case 'h':{
			  myStr=myStr.append(this.h);
			  break;
		  }
			  
		  case 'i':{
			  myStr=myStr.append(this.i);
			  break;
		  }
			
		  case 'j':{
			  myStr=myStr.append(this.j);
			  break;
		  }
			  
		  case 'k':{
			  myStr=myStr.append(this.k);
			  break;
		  }
			
		  case 'l':{
			  myStr=myStr.append(this.l);
			  break;
		  }
			  
		  case 'm':{
			  myStr=myStr.append(this.m);
			  break;
		  }
			
		  case 'n':{
			  myStr=myStr.append(this.n);
			  break;
		  }
			  
		  case 'o':{
			  myStr=myStr.append(this.o);
			  break;
		  }
			
		  case 'p':{
			  myStr=myStr.append(this.p);
			  break;
		  }
			  
		  case 'q':{
			  myStr=myStr.append(this.q);
			  break;
		  }
			
		  case 'r':{
			  myStr=myStr.append(this.r);
			  break;
		  }
			  
		  case 's':{
			  myStr=myStr.append(this.s);
			  break;
		  }
			
		  case 't':{
			  myStr=myStr.append(this.t);
			  break;
		  }
			  
		  case 'u':{
			  myStr=myStr.append(this.u);
			  break;
		  }
			
		  case 'v':{
			  myStr=myStr.append(this.v);
			  break;
		  }
			  
		  case 'w':{
			  myStr=myStr.append(this.w);
			  break;
		  }
			
		  case 'x':{
			  myStr=myStr.append(this.x);
			  break;
		  }
			  
		  case 'y':{
			  myStr=myStr.append(this.y);
			  break;
		  }
			
		  case 'z':{
			  myStr=myStr.append(this.z);
			  break;
		  } 
		  case '0':{
			  myStr=myStr.append(this.zero);
			  break;
		  }
			  
		  case '1':{
			  myStr=myStr.append(this.one);
			  break;
		  }
			
		  case '2':{
			  myStr=myStr.append(this.two);
			  break;
		  }
			  
		  case '3':{
			  myStr=myStr.append(this.three);
			  break;
		  }
			
		  case '4':{
			  myStr=myStr.append(this.four);
			  break;
		  } 
		  case '5':{
			  myStr=myStr.append(this.five);
			  break;
		  }
			  
		  case '6':{
			  myStr=myStr.append(this.six);
			  break;
		  }
			
		  case '7':{
			  myStr=myStr.append(this.seven);
			  break;
		  }
			  
		  case '8':{
			  myStr=myStr.append(this.eight);
			  break;
		  }
			
		  case '9':{
			  myStr=myStr.append(this.nine);
			  break;
		  } 
		  case '@':{
			  myStr=myStr.append(this.atrate);
			  break;
		  }
			  
		  case '#':{
			  myStr=myStr.append(this.hash);
			  break;
		  }
			
		  case ',':{
			  myStr=myStr.append(this.comma);
			  break;
		  } 
		  default :{
			  myStr=myStr.append(ch[i]);
		  }

		  }
	   }	
	 return String.valueOf(myStr);
	}
	public String deCrypt(String Str) {
		StringBuilder mystr= new StringBuilder("");
	
		int i=0;
		while(i<Str.length()-2) {
			String str=Str.substring(i,i+3);
			if((int)Str.charAt(i)!=32)
			{
			if(str.equals(this.a)) {
				mystr=mystr.append("a");
			}
			if(str.equals(this.b)) {
				mystr=mystr.append("b");
			}
			if(str.equals(this.c)) {
				mystr=mystr.append("c");
			}
			if(str.equals(this.d)) {
				mystr=mystr.append("d");
			}
			if(str.equals(this.e)) {
				mystr=mystr.append("e");
			}
			if(str.equals(this.f)) {
				mystr=mystr.append("f");
			}
			if(str.equals(this.g)) {
				mystr=mystr.append("g");
			}
			if(str.equals(this.h)) {
				mystr=mystr.append("h");
			}
			if(str.equals(this.i)) {
				mystr=mystr.append("i");
			}
			if(str.equals(this.j)) {
				mystr=mystr.append("j");
			}
			if(str.equals(this.k)) {
				mystr=mystr.append("k");
			}
			if(str.equals(this.l)) {
				mystr=mystr.append("l");
			}
			if(str.equals(this.m)) {
				mystr=mystr.append("m");
			}
			
			if(str.equals(this.n)) {
				mystr=mystr.append("n");
			}
			if(str.equals(this.o)) {
				mystr=mystr.append("o");
			}
			if(str.equals(this.p)) {
				mystr=mystr.append(a);
			}
			if(str.equals(this.q)) {
				mystr=mystr.append("q");
			}
			if(str.equals(this.r)) {
				mystr=mystr.append("r");
			}
			if(str.equals(this.s)) {
				mystr=mystr.append("s");
			}
			if(str.equals(this.t)) {
				mystr=mystr.append("t");
			}
			if(str.equals(this.u)) {
				mystr=mystr.append("u");
			}
			if(str.equals(this.v)) {
				mystr=mystr.append("v");
			}
			if(str.equals(this.w)) {
				mystr=mystr.append("w");
			}
			if(str.equals(this.x)) {
				mystr=mystr.append("x");
			}
			if(str.equals(this.y)) {
				mystr=mystr.append("y");
			}
			if(str.equals(this.z)) {
				mystr=mystr.append("z");
			}
			if(str.equals(this.one)) {
				mystr=mystr.append("1");
			}
			if(str.equals(this.two)) {
				mystr=mystr.append("2");
			}
			if(str.equals(this.three)) {
				mystr=mystr.append("3");
			}
			if(str.equals(this.four)) {
				mystr=mystr.append("4");
			}
			if(str.equals(this.five)) {
				mystr=mystr.append("5");
			}
			if(str.equals(this.six)) {
				mystr=mystr.append("6");
			}
			if(str.equals(this.seven)) {
				mystr=mystr.append("7");
			}
			if(str.equals(this.eight)) {
				mystr=mystr.append("8");
			}
			if(str.equals(this.nine)) {
				mystr=mystr.append("9");
			}
			if(str.equals(this.zero)) {
				mystr=mystr.append("0");
			}
			if(str.equals(this.atrate)) {
				mystr=mystr.append("@");
			}
			if(str.equals(this.hash)) {
				mystr=mystr.append("#");
			}
			if(str.equals(this.comma)) {
				mystr=mystr.append(",");
			}
			i+=3;
	    	}
			else {
				mystr=mystr.append(Str.charAt(i));
				i++;
			}
		}
		return String.valueOf(mystr);
			
	}

	public static void main(String[] args) {
		Crypto obj=new Crypto();
		String s="my name is govind ,";
		s=s.toLowerCase();
		String str=obj.crypto(s);
		System.out.println(str);
		String st=obj.deCrypt(str);
		System.out.println(st);

	}

}
