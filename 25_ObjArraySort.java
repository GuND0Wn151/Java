class Student{
	String name;
	int age;
	String roll;
	Student(String b,String n,int a){
		name=n;
		age=a;
		roll=b;
	}
	void displayDetails(){
		System.out.println("roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println();
	}
	
	
}


class 25_ObjArraySort{
	public static void main(String args[]){
		Student[] p=new Student[5];
		Student temp;
		p[0]=new Student("2","st2",10);	
		p[1]=new Student("1","st1",11);	
		p[2]=new Student("3","st3",14);	
		p[3]=new Student("5","st5",17);	
		p[4]=new Student("4","st4",13);	
		for(int i=0;i<5-1;i++){
			for(int j=0;j<5-i-1;j++){
				if((p[j].roll).compareTo(p[j+1].roll)>0){
					temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				}
			}
		}
		for(int i=0;i<5;i++){
			p[i].displayDetails();
		}
			
	}
}