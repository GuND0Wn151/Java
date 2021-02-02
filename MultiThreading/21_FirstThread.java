class TestThread extends Thread{
public void run(){
	try{
	for(int i=50;i<56;i++){
	System.out.println(i);
	Thread.sleep(1000);
	}
	}
	catch(InterruptedException ie){}
	}

}

public class MainThread{
public static void main(String ar[]){
	TestThread t= new TestThread();
	t.start();
	}
}
