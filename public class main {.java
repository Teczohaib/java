
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a+ " " + b +" ");
        int c=0;
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
}