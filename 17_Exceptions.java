import java.util.*;
class Task12{
	public static void main(String args[]){
		int[] ar=new int[5];
		String x="JAva";
		String z=null;
		try{
			System.out.println(z.length());
			System.out.println(x.charAt(5));
			System.out.println(x.charAt(1));
			System.out.println(ar[1]);
			System.out.println(ar[11]);
	
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a);
		
		}
		catch(StringIndexOutOfBoundsException t){
			System.out.println(t);
			//t.printStackTrace();
		}
		catch(NullPointerException b){
			System.out.println(b);
		}
		
	}
}