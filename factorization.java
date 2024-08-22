import java.util.Scanner;
class factorization{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2; i <n;i++){
            while(n%i==0){
                n=n / i;
                System.out.println(n);

            }
        }
        if(n!=1){
            System.out.print(n);
        }
    }
}