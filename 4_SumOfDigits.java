import java.util.*;
class Task4{
	public static void main(String args[]){
		int a,t,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value");
		a=input.nextInt();
		while(a!=0){
			//System.out.println(a);
			count=count+1;
			a=a/10;
		}
		System.out.println("No of digits are:"+count);
	}
}