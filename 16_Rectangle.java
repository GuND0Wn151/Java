class Rectangle{
	double height,breadth;
	Rectangle(double a,double b){
		height=a;
		breadth=b;
		
	}
	
	void getPerimeter(){
		System.out.println("perimeter: "+2*(height+breadth));
	}
	void getArea(){
		System.out.println("area: "+height*breadth);
	}
	
}

class Task17{
	public static void main(String args[]){
		Rectangle box1=new Rectangle(10,20);
		box1.getArea();
		box1.getPerimeter();
	}
}