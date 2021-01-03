import java.util.*;
public class Hello_Nrepitations
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the String");
	    String a=input.next();
	    System.out.println("Enter n Value");
	    int n=input.nextInt();
	    String x="";

	    for(int i=0;i<n;i++)
	    x+=a.substring(a.length()-n,a.length());
	    System.out.println(x);
	}
}
