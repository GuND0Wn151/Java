import java.util.Scanner;
public class sort {
    static void algo(int ar[]){
        int temp;
        int n=ar.length;
        for(int i=0;i<n;i++)
            for(int j=0;j<n-1-i;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }

        }
    }
    
    public  static void main(String[] args){ 
    Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
			//int b= sc.nextInt();
			int x[]=new int[a];
			for (int i =0;i<a;i++){
					x[i]=sc.nextInt();
            }
            algo(x);
			for (int i =0;i<a;i++){
					 System.out.print(x[i]+ " ");
			}
		
            sc.close();
        }
}
