import java.util.*;
class EvenOrOdd{
	public static void main(String args[]){
		int a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value");
		a=input.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		input.close();
	}

}
