import java.util.*;

class ArrayList{
    public static void main (String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("hello");
        a.add("this");
        a.add("is");
        a.add("ArrayList");
        System.out.println("Index 0 is "+a.get(0));
        a.remove(0);
        System.out.println("Index 0 is "+a.get(0));
        System.out.println(a);
        a.add("new");
        a.add("String");
        for(int i=0;i<a.size();i++)
        System.out.println(a.get(i));
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        System.out.println("Index 1 is "+b.get(1));
        b.remove(1);
        System.out.println("Index 0 is "+b.get(0));
        System.out.println(b);
        b.set(0,0);
        System.out.println(b);
        System.out.println("Size "+b.size());
        b.add(100);
        for(int i : b)
        System.out.println(i);
    }
}

