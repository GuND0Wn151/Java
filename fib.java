import java.util.Scanner;

public class fib {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int k = input.nextInt();
        int a=0;
        int b=1;
        int t;
        for(int i=0;i<k;i++){
            System.out.println(a);
            t=a;
            a=b;
            b=b+t;
        }
        input.close();
    }
 
}
