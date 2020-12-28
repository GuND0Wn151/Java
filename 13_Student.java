import java.util.*;
class Student{
	String id,name,address;
	int age;
	Student(String a, String b,String c,int d){
		name =a;
		id=b;
		address=c;
		age=d;

	}
	void displayDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("id: "+this.id);
		System.out.println("address: "+this.address);
		System.out.println("age: "+this.age);
		
	}
}


class Task10{
	public static void main(String args[]){
		Student a=new Student("ram","232",'city collge',10);
		
		a.displayDetails();
	
	}


}