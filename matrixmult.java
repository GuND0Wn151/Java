

import java.util.Scanner;


public class matrixmult {
    static void matmult(int ar1[][],int ar2[][],int m,int n,int p,int q){
        int mr[][] =new int[m][q];
        for (int i =0;i<m;i++){
            for(int j=0;j< q;j++)
            System.out.print(ar1[i][j]);
            System.out.println();
        }
        for (int i =0;i<m;i++){
            for(int j=0;j< q;j++)
            System.out.print(ar2[i][j]);
            System.out.println();
        }
        if(n!=p)
        System.out.println("not valid matrix");
        else{
            
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                   //System.out.println(i+"dfdsfds"+j);
                    for(int t=0;t<n;t++){
                    mr[i][j]+=  ar1[i][t]*ar2[t][j]; 
                    //System.out.println(ar1[i][t]+"xxxxxxx"+ar2[t][j]);
                    }
                }
            }
        
        for (int i =0;i<m;i++){
            for(int j=0;j< q;j++)
            System.out.print(mr[i][j]);
            System.out.println();
        }
    }
}

    public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
            System.out.println("enter the arrray 1 size");
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println("enter the arrray 2 size");
            int p=sc.nextInt();
            int q=sc.nextInt();
            System.out.println(m+" "+n+" "+p+" "+q);
            int x[][]=new int[m][n];
            int y[][]=new int[p][q];
            System.out.println("enter the elements arrray 1");
            for (int i =0;i<m;i++){
                for(int j=0;j<n;j++)
					x[i][j]=sc.nextInt();
            }
            System.out.println("enter the elements arrray 2");
            for (int i =0;i<p;i++){
                for(int j=0;j<q;j++)
					y[i][j]=sc.nextInt();
			}
			matmult(x,y,m,n,p,q);
		
			sc.close();
    }
    


    
}
