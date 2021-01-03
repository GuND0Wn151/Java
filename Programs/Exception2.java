import java.util.*;

public class Exception2
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    String num1=input.next();
	    String num2=input.next();
	    try{
	        System.out.println(Integer.parseInt(num1)/Integer.parseInt(num2));
	    }
	    catch(NumberFormatException ne){ne.printStackTrace();}
	    catch(ArithmeticException ae){ae.printStackTrace();}
	}
}
