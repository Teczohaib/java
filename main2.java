import java.util.Scanner;
class parent
{
    int age,id;
    String name;
    void nameing(String name)
    {
        System.out.println("name"+name);
    }
}
class child extends parent
{
    void age(int age)
    {
        System.out.println("age of student is"+age);
    }
}
class main2
{
    public static void main(String[] args)
    {
        child s= new child();
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String a=sc.nextLine();
        s.nameing(a);
        s.age(n);
    }
}