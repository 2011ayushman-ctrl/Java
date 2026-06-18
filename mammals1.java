//this activity is mainly to explain Hierarchial inheritance 
//parent class
class Mammals{
    void mam(){
        System.out.println("Inside Mammals Class");

    }
}
//child class
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion class");
    }
}
//child
class Humans extends Mammals{
    void hum(){
        System.out.println("Inside Humans class");
    }
}
class mammals1{
    public static void main(String args[]){
        Lion obj=new Lion();//object of child of child class obj.hum();//this will result in error to run this we have to create object of Human
        obj.roar();
        obj.mam();
}
}