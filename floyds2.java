import java.util.Scanner;

public class floyds2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int k=1;
        int x[][]= new int[a][];
        for(int i=0;i<a;i++){
            x[i]=new int[i];
            for(int j=0;j<i;j++){
                x[i][j]= k;
                k++;
            }
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        input.close();


    }
}