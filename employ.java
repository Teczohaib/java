class employ1
{
    int empo;
    String name;
    float salar;
    employ1(int  e1,String n,float s){
        empo=e1;
        name=n;
        salar= s;
    }
    void display(){
        System.out.println("employee id is "+empo +"\n name is"+name+"\n salar is "+ salar);
    }
}
class employ{
    public static void main(String[] args){
        employ1 emp = new employ1(101,"Zohaib",5000);
        employ1 emp2=new employ1(404,"Ahmed",2000);
        employ1 emp3=new employ1(606,"Ali",10000);
        emp.display();
        emp2.display();
        emp3.display();

    }
}