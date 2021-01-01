import java.util.*;
import java.lang.Math;
class Task7{
	public static void main(String args[]){
		int h=0,t,a,count=0;
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		t=a+0;
		
		while(a!=0){
			count+=1;
			a=a/10;
		}
		a=t+0;
		while(a!=0){
			h+=Math.pow(a%10,count);
			a=a/10;
		}
		if(t==h)
		System.out.println("Armstrong");
		else
		System.out.println("Not Armstrong");
	input.close();
	}

}
