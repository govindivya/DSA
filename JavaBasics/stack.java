package govindProject;

public class stack {
	int size;
	Object [] arr;
	int top;
	

	public stack() {
	 top=-1;
	 size=0;
	 arr=new Object[20];
		
	}
	public stack(int num) {
		size=0;
		arr=new Object[num];
		top=-1;
	}
	 
	public boolean isEmpty() {
	  if (size==0)
		  return true;
	  else 
		  return false;
	}
    public boolean isFull() {
    	if (size==this.arr.length)
    		return true;
    	else 
    		return false;
    }
    public Object pop() {
    	if(isEmpty()==false) {
    		int num=top;
    		top--;
    		size--;
    		return arr[num];
    		
    	}
    	else 
    		return "Empty stack";
    }
    public boolean push(Object a) {
    	if(isFull()==false) {
    		top++;
    		arr[top]=a;
    		size++;
    		return true;
    	}
    	else 
    		return false;
    }
    public int size() {
    	return size;
    }
    public boolean clear() {
    	for(int i=0;i<arr.length;i++)
    		pop();
    	return true;
    }
   boolean find(Object obj) {
    	stack s=new stack(this.arr.length);
    	boolean check=false;
    	for(int i=0;i<this.size;i++) {
    		s.arr[i]=this.pop();
    		if(obj.equals(s.arr[i]))
    			check = true;
    	}
       for(int i=0;i<s.arr.length;i++) {
    	   this.arr[i]=s.pop();
       }
    	return check;
    	
    	
    }
   public void printAll() {
	   for(int i=0;i<=size-1;i++)
		   System.out.println(arr[i]);
	   
   }
	public static void main(String[] args) {
		stack st=new stack(10);
		System.out.println(st.push(Integer.valueOf(12)));
		System.out.println(st.push(Integer.valueOf(17)));
		System.out.println(st.push("Ram"));
	
		System.out.println(st.size());
		
	}

}
