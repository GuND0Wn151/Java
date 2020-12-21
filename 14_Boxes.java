class Box{
	double height,width,depth;
	Box(double a,double b,double c){
		height=a;
		width=b;
		depth=c;
	}
	Box(){}
	void computeVolume(double a,double b,double c){
		System.out.println(" "+a*b*c);
		
	}
	
}

class Task15{
	public static void main(String args[]){
	/*Box testbox1=new Box(10,20,30);
	Box testbox2=new Box(40,50,60);
	Box testbox3=new Box(70,80,90);	*/
	Box testbox1=new Box();
	Box testbox2=new Box();
	Box testbox3=new Box();
	
	/*testbox.height=10.0;
	testbox.width=23.4;
	testbox.depth=33.3;*/
	testbox1.computeVolume(10,20,30);
	testbox2.computeVolume(40,50,60);
	testbox3.computeVolume(70,80,90);
	}
}