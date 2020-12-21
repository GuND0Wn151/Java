import java.util.*;
class Task14{
	public static void main(String args[]){
		
		int t=1;
		int[][] a =new int[10][];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		for(int i=0;i<a.length;i++){
			
			a[i]=new int[i+1];
			for(int j=0;j<=i;j++)
				a[i][j]=t++;
		}
		for(int[] i:a){
			for(int j:i)
			System.out.print(j+" ");
			System.out.println();
		}
	
	
	}
	


}