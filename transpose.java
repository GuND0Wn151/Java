import java.util.Scanner;


public class transpose {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int x[][] = new int[a][a];
        int y[][] = new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                x[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                y[i][j]=x[j][i];
                
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(y[i][j]);
                System.out.print(" ");
            }
        System.out.println();
        }

        sc.close();

    }

    
}