import java.util.Scanner;
class Main{
    public static void main (String[]args ){
    Scanner scn=new Scanner(System.in);
    int number;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    char choice;
    do
    {
        System.out.println("Enter the number");
        number = scn.nextInt();
        if(number>max)
        {
        max = number;
        }
        if(number<min)
        {
            min = number;
        }
        System.out.print("Do you what to continew y/n");
        choice = scn.next().charAt(0);
    }while(choice=='y'|| choice=='y');
    System.out.println("largest number"+ max);
    System.out.println("smallest number"+ min);
    }
}