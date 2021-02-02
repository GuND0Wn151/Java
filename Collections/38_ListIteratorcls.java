//arraylist iterator
import java.util.*;
class ListIteratorcls{
	public static void main(String argsp[]){
		ArrayList<Integer> t1= new ArrayList<Integer>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.remove(0);
		System.out.println(t1);
		
		
	}Iterator<Integer> x=t1.iterator();
		System.out.println("Elements: ");
		while(x.hasNext())

			System.out.println((Object)x.next());
}
