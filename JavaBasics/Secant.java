package govindProject;


import java.util.*;

public class Secant {
    public static void main(String[] args) {
        
        double x_1,x0,root,given=5,error;
        boolean flag=true;
        int i=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for x_1 : ");
        x_1 = sc.nextDouble();

        System.out.print("Enter value for x0 : ");
        x0 = sc.nextDouble();

        while(flag){
            root = x0 - ((F(x0)*(x0-x_1))/(F(x0)-F(x_1)));
            error = Math.abs((root-x0)/root)*100;

            System.out.println("Iteration : "+ i++);
            System.out.println("Root:"+root);
            System.out.println("Error:"+error);

            x_1 = x0;
            x0 = root;

            if(given>error)
            {
                    flag=false;
            }
        }
    }
            
    public static double F(double x){
        return Math.pow(x,3)-(0.165*Math.pow(x,2))+(3.993*Math.pow(10,-4));
    }
    
}
