//emplaye list

import java.util.*;
class Employe{
	String name,designation;
	int salary;
	Employe(String a,String b,int c){
		name=a;
		designation=b;
		salary=c;
	}
	void displayDetails(){
		System.out.println("Name "+name);
		System.out.println("Designation "+ designation);
		System.out.println("Salary "+salary);
	}
}


class 36_EmployeeArrayList{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		ArrayList<Employe> e=new ArrayList();
		System.out.println("Enter the number of employes");
		int n=input.nextInt();
		System.out.println("Enter details name designation and salary");
		for(int i=0;i<n;i++){
			String a1=input.next();
			String a2=input.next();
			int a3=input.nextInt();
			e.add(new Employe(a1,a2,a3));
		}
		Iterator<Employe> itr=e.iterator();
		while(itr.hasNext()){
			System.out.println();
			itr.next().displayDetails();
			
		}
		
	}
	
	
	
}
