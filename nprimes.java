import java.util.Scanner;

public class nprimes {
    public static void main(String[] arg){
    Scanner input = new Scanner(System.in) ;
    System.out.println("enter the number ");
    int a = input.nextInt();
    System.out.println("the number are ");
    for(int i=2;i<=a;i++){
        int k=0;
        for(int j=2;j<i;j++){
            if(i%j==0)
                k=1;

        }
        if(k==0)
        System.out.println(i);
        k=0;
    }


    input.close();
    }
    
}