class Employee{
	String id,name;

}
class Salary extends Employee{
	String desig;
	int sal;
	Salary(String a,int b,String c,String d){
		desig=a;
		sal=b;
		id=c;
		name=d;
	}
	void displayDetails(){
		System.out.println();
		System.out.println("desig: "+desig);
		System.out.println("salary: "+sal);
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	
}
class 26_ArraySalary{
	public static void main(String args[]){
		Salary[] p=new Salary[5];
		p[0]=new Salary("boss",50000,"121","ram");
		p[1]=new Salary("assistent",40000,"122","vijay");
		p[2]=new Salary("clerk",45000,"1227","ken");
		p[3]=new Salary("manager",15000,"123","nishal");
		p[4]=new Salary("watchman",10000,"124","nihal");
		for(int i=0;i<5;i++){
			if(p[i].sal>20000)
			p[i].displayDetails();
		}
	}
}
