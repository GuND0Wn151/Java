import java.util.*;

public class 34_StackQueuDeque{
	public static void main(String[] args) {
		//stack
		System.out.println("-------Stack-------");
		Stack<Integer> st = new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.push(3);
        st.push(4);
        System.out.println("Elements Are");
        for(int i : st)
        System.out.println(i);
        st.pop();
        st.pop();
        System.out.println("After pop");
        System.out.println(st);
        System.out.println("Peek value "+st.peek());
        //additional methods are empty ,search etc
        
	    //Queue
	    System.out.println("-------Queue-------");
	    Queue<Integer> qu=new ArrayDeque<Integer>();
	    qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        System.out.println("Elements Are");
        for(int i : qu)
        System.out.println(i);
        qu.remove();
        qu.remove();
        System.out.println("After Deleting "+qu);
	   
	    System.out.println("Peek value "+qu.peek());
	    
	    
	    //Dequeue
	    System.out.println("-------Dqueue-------");
	    ArrayDeque<Integer> dqu=new ArrayDeque<Integer>();
	    dqu.add(1);
        dqu.add(2);
        dqu.add(3);
        dqu.add(4);
        System.out.println("Elements Are");
        for(int i : dqu)
        System.out.println(i);
        dqu.addFirst(0);
        dqu.addLast(5);
        System.out.println("After Adding "+dqu);
	    dqu.removeFirst();
	    dqu.removeLast();
	    System.out.println("After Deleting "+dqu);
	    
	    
	}
}
