class SomeThread extends Thread{
	public void run(){
	try{
	for(int i=1;i<6;i++){
	System.out.println(i+" "+Thread.currentThread().getName());
	Thread.sleep(2000);
	}
	}
	catch(InterruptedException ie){}
	}
}
public class 22_TwoThreads{
public static void main(String[] asd){
	SomeThread t1=new SomeThread();
	SomeThread t2=new SomeThread();
	t1.setName("Thread1");
	t2.setName("Thread2");
	t1.start();
	t2.start();
	}
}
