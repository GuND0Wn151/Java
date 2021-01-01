import java.util.*;
class Task3{
	public static void main(String args[]){
		int a,i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value");
		a=input.nextInt();
		input.close();
		for(i=1;i<=a;i++){
			if(i%2==0)
			System.out.println(i);
		}
		
	}
}
