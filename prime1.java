import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        int count=0;
        for (int i =2; i<a;i++){
                if (a % i==0){
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            }else{
                System.out.println("not a prime");
            }
            }
        }