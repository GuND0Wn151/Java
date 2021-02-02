class Plate {
	int l=0;
	boolean avail;
	synchronized public void put(int a){
		try{
		while(avail==true){
				System.out.println("hhh");
				wait();}
			l=a;
			System.out.println("put: "+a);
			avail=true;
			notify();
		}catch(Exception x){}
	}
	
	synchronized public void get(){
		try{
			while(avail==false)
				wait();
			
			System.out.println("get:"+l);
			avail=false;
			notify();
		}catch(Exception e){}
	}
}
class Producer extends Thread{
	Plate g;
	Producer(Plate f){
		g=f;
		Thread t=new Thread(this);
		t.start();
	}
	public void run(){
		for(int i=1;i<6;i++)
			g.put(i);
	}
	
}
class Consumer extends Thread{
	Plate g;
	Consumer(Plate f){
		g=f;
		Thread t= new Thread(this);
		t.start();
	}
	public void run(){
		for(int i=1;i<6;i++)
			g.get();
	}
}
class 29_Prodconsplat{
	public static void main(String args[]){
		Plate p=new Plate();
		Consumer cr=new Consumer(p);
		Producer pr=new Producer(p);
	}
}
