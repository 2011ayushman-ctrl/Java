class Student1
{
    int id;
    String name;
    float stripened;

    Student1(){}

    Student1 (int id, String name){
        this.id=id;
        this.name=name;
    }

    Student1 (int id, String name, float stripened){
        this.id=id;
        this.name=name;
        this.stripened=stripened;
    }
    void displayDetails(){
        System.out.println(this.id + "| " + this.name + " | " + this.stripened);
    }
} //Student

class Student2{
    public static void main(String[] args) {
        Student1 st1=new Student1(); //default constructor
        Student1 st2=new Student1(45, "Aashish"); //overloaded constructor with 2 parameters
        Student1 st3=new Student1(234, "Cody",10000); //overloaded constructor with 3 parameters

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
}
}