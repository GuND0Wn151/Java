abstract class Shape{
	int base,height;
	void shapeArea(){
		System.out.println(base*height);
	}
}

class Rectangle extends Shape{
		
		Rectangle(int a,int b){
			base=a;height=b;
		}
		void ShapeArea(){
			super.shapeArea();
		}
}
class Triangle extends Shape{
	Triangle(int a,int b){
		base=a;height=b;
	}
	void shapeArea(){
		System.out.println(.5*base*height);
	}
}


class 27_AbsShape{
	
	public static void main(String args[]){
		Rectangle rec1=new Rectangle(4,2);
		Triangle tri1=new Triangle(3,5);
		rec1.shapeArea();
		tri1.shapeArea();
	}
}