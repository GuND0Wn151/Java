import java.util.*;
class Task9{
	public static void main(String args[]){
		int k=0,a;
		Scanner input =  new Scanner(System.in);
		System.out.println("enter the value");
		a=input.nextInt();
		for(int i=2;i<a;i++){
			if(a%i==0){
				k+=1;
				break;
			}
		}
		if(k==0)
		System.out.println("PRime");
		else
		System.out.println("Not Prime");
	}
}