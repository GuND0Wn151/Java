import java.util.*;
class Student{
	double math,science,english,social;
	
	
	void grad(){
		double x=(math+science+english+social)/4;
		System.out.println(x);
		if(x>=90)
			System.out.println("A");
		else if(x>=80)
			System.out.println("B");
		else if(x>=70)
			System.out.println("C");
		else if(x>=60)
			System.out.println("D");
		else
			System.out.println("E");
	}
}


class Task16{
	public static void main(String args[]){
		Student ram = new Student();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the marks of 4 subjects");
		ram.math=input.nextInt();
		ram.science=input.nextInt();
		ram.english=input.nextInt();
		ram.social=input.nextInt();
		System.out.println(ram.math);
		ram.grad();
		input.close();
	}
}