import java.util.*;
import java.lang.Math;
class Task6{
	public static void main(String args[]){
		int a,b,c,delta;
		double r1,r2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the values of a b c");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		delta=b*b-(4*a*c);
		if(delta<0)
			System.out.println("Imaginary roots");
		else if(delta==0)
			System.out.println("The roots are"+(-b/(2*a))+" "+(-b/(2*a)));
		else{
			r1=((-b)+Math.pow(delta,0.5))/2*a;
			r2=((-b)-delta)/2*a;
			System.out.println("The roots are:"+r1+" "+r2);
		}
		
		
		input.close();
	
	}

}
