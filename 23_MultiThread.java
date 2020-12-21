class SomeThread1 extends Thread{
public void run(){
try{
for(int i=0;i<10;i++){
System.out.println("Hello");
Thread.sleep(2000);
	}}
catch(InterruptedException ie){}
}
}

class SomeThread2 extends Thread{
public void run(){
try{
for(int i=0;i<10;i++){
System.out.println("Welcome");
Thread.sleep(1000);
	}}
catch(InterruptedException ie){}
}
}
public class  MainThread3{
public static void main(String[] as){
	SomeThread1 t1=new SomeThread1();
	SomeThread2 t2=new SomeThread2();
	t1.start();
	t2.start();
	
	}
}