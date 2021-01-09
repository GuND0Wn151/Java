import java.util.*;
class 11_StringOps{
	public static void main(String args[]){
		String a="This is a String";
		
		System.out.println("charAt:"+a.charAt(2));
		System.out.println("indexOf:"+a.indexOf("s"));
		System.out.println("lastindex:"+a.lastIndexOf("i"));
		System.out.println("length:"+a.length());
		System.out.println("subString:"+a.substring(2,5));
		System.out.println("compareTo"+a.compareTo("hi"));
		System.out.println("equals"+a.equals("time"));
		//System.out.println();
	}
}
