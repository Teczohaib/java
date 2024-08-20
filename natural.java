import java.util.Scanner;
class natural{
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int i;
        int sum =0;
        for (i=1;i<=a;i++){
            sum=sum+i;
        }
        System.out.println("the sum is "+sum);
    }
}  