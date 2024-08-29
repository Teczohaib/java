class student
{
    int id;
    String name;
    float stipend;
    student(){}
    student(int id, String name){
        this.id= id;
        this.name=name;
    }
    student(int id , String name,float stipend){
        this.id = id;
        this.name=name;
        this.stipend=stipend;
    }
    void displaydetails(){
        System.out.println(this.id+"|"+ this.name+ "|"+ this.stipend);
    }
}
class student1{
    public static void main(String[] args)
    {
        student st1=new student();
        student st2=new student(30,"ali");
        student st3=new student(45,"zohaib",3000);
        st1.displaydetails();
        st2.displaydetails();
        st3.displaydetails();

    }
}