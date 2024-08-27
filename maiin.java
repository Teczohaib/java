class Animal{
    void eat(){
        System.out.println("eating.");
    }
}
class lion extends Animal{
    void roar(){
        System.out.println("roar");
    }  
}
class babylion extends lion{
    void weep(){
        System.out.println("weeping");
    }
}
class maiin{
    public static void main(String[] args){
        babylion obj= new babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    } 
}