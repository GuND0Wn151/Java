import java.util.*;
class Task11{
	public static void main(String args[]){
		int temp,min=0;
		int[] ar=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.println("ENter the values of array");
		for(int i=0;i<10;i++)
		ar[i]=input.nextInt();
		for(int i=0;i<10;i++){
			min=i;
			for(int j=i+1;j<10;j++){
				if(ar[i]>ar[j])
				min=j;
			}
			temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
			
		}
		for(int i=0;i<10;i++)
			System.out.print(ar[i]+" ");
	input.close();
	}



}
