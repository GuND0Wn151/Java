
public class 9_Prime
{
	public static void main(String[] args) {
		int k=0,a,b;
		Scanner input =  new Scanner(System.in);
		System.out.println("enter the value");
		a=input.nextInt();
		b=input.nextInt();
		for(int j =a;j<=b;j++){
		    k=0;
			for(int i=2;i<j;i++){
				if(j%i==0)
					k+=1;
			}
			if(k==0)
			System.out.println(j);
		}
	
	}
}
