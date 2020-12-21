import java.util.*;
class Task8{
	public static void main(String args[]){
		int m,n,temp,p=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no.of rows and coloumns");
		m=input.nextInt();
		n=input.nextInt();
		System.out.println("Enter the values of array");
		int[][] ar=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				ar[i][j]=input.nextInt();
			}
		System.out.println("the matrix is");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(ar[i][j]+" ");}
			System.out.println();
		}
		for(int i=p;i<m;i++){
			for(int j=0;j<n;j++){
					temp=ar[i][j];
					ar[i][j]=ar[j][i];
					//System.out.println(temp+" "+ar[i][j]+" "+ar[j][i]);
					ar[j][i]=temp;
				}
			p+=1;
			}
		System.out.println("The transposed matrix is");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(ar[j][i]+" ");}
			System.out.println();
			}
		
	
	}

}