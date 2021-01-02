//linked list
import java.util.*;

class 37_LinkedListCls{
	public static void main(String args[]){
		
		LinkedList t1=new LinkedList();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(4);
		System.out.println("firstelement "+t1.peekFirst());
		System.out.println("lastelement "+t1.peekLast());
		System.out.println("deletefirst "+t1.pollFirst());
		System.out.println("delete last "+t1.pollLast());
		t1.addFirst(10);
		t1.addLast(11);
		System.out.println(t1);
		Iterator<Integer> x=t1.iterator();
		System.out.println("Elements: ");
		while(x.hasNext())

			System.out.println((Object)x.next());
	}
	
	
}
