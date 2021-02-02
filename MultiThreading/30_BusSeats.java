class BusApp extends Thread{
    int available=1;
    public void run(){
        synchronized(this){
                if(available>=1){
                    System.out.println("You Got a Seat");
                    available--;
                }
                else
                System.out.println("No Seats");
        }
    }
}

public class BusSeats
{
	public static void main(String[] args) {
		BusApp a= new BusApp();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		t1.start();
    t2.start();
		t3.start();
		
	}
}
