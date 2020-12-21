import java.util.*;
class Student{
	String id,name,address;
	int age;
	void displayDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("id: "+this.id);
		System.out.println("address: "+this.address);
		System.out.println("age: "+this.age);
		
	}
}


class Task10{
	public static void main(String args[]){
		Student a=new Student();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values Name id address age");
		a.name=input.next();
		a.id=input.next();
		a.address=input.next();
		a.age=input.nextInt();
		a.displayDetails();
	
	}


}