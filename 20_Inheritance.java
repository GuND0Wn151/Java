import java.util.*;
class Test1 {
	int var=10;
	void method(){
		System.out.println("IN 1");
	}


}

class Test2 extends Test1{
	int b=20;
	void test(){
		System.out.println(var+b);
	}

}





class Task5{
	public static void main(String args[]){
		
			Test2 a=new Test2();
			a.method();
			a.test();
	
	}

}