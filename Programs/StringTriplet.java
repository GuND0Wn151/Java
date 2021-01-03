import java.util.*;
public class StringTriplet
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the String");
	    String a=input.next();
	    int n=a.length();
	    int count=0;
	    for(int i=0;i<n-3;i++){
	        String x=a.substring(i,i+1)+a.substring(i,i+1)+a.substring(i,i+1) ;
	        if(x.equals(a.substring(i,i+3)))
	            count++;
	    }
	    System.out.println(count);
	}
}
