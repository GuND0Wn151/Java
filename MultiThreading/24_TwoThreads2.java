class MyThread extends Thread{
	public void run(){
		try{
			for(int i=1;i<6;i++){
			System.out.println(i);
			Thread.sleep(2000);
			}
		}
		catch (InterruptedException ie){}
	}
}


public class 24_TwoThread2{
public static void main(String[] ad){
	MyThread t1=new MyThread();
	try{	
		t1.start();
		t1.join();
		for(int i=50;i<56;i++){	
		System.out.println(i);
		Thread.sleep(2000);
		}
		}
	catch(Exception e){}
	}
}
