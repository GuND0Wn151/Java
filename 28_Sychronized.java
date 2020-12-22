class BusApp extends Thread{//class BusApp implements Runnable
	int avail=2;
	public void run(){
		//System.out.println("sssssssssssssssss");
		synchronized(this){
			if(avail>0){
				
				avail--;
				//System.out.println(avail+"   ss");
				System.out.println("You have a seat");
				System.out.println(avail+"   ss");
				
			}
			else{
				System.out.println("No seat");
			}
		}
	}
}



class 28_Sychronized{
	public static void main(String args[]){
		BusApp a= new BusApp();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		Thread t4=new Thread(a);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}