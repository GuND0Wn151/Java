import java.util.*;

class 33_HashSet{
    public static void main (String[] args) {
        HashSet<String> a=new HashSet<String>();
        a.add("hello");
        a.add("this");
        a.add("is");
        a.add("HashSet");
        // HashSet doesn have methods like set and get
        a.remove(0);
        System.out.println("Does it contain this "+a.contains("this"));
        System.out.println(a);
        a.add("new");
        a.add("String");
        for(String i : a)
        System.out.println(i);;
        HashSet<Integer> b=new HashSet<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        //there can be no duplicate elements in hashset
        b.remove(1);
        System.out.println("Does it contain 0 "+b.contains(0));
        System.out.println(b);
       
        System.out.println(b);
        System.out.println("Size "+b.size());
        b.add(100);
        for(int i : b)
        System.out.println(i);
    }
}

