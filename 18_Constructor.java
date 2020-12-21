class Student{
	String name,roll_no;
	int age;
	Student(){}
	Student(String name,String roll_no){
		this.name=name;
		this.roll_no=roll_no;
		System.out.println(name);
		System.out.println(roll_no);
	}
	Student(String name,String roll_no,int age){
		this.name=name;
		this.roll_no=roll_no;
		this.age=age;
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(age);

	}
	/*void getDetails(){
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(age);
	}*/
}
class Task19{
	public static void main(String args[]){
		Student ram=new Student("ram","23232dsf4");
		//ram.getDetails();
		
	}
}