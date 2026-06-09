import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello user, please enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your lucky number:");
        int luckyNumber=sc.nextInt();
        System.out.println("Hello " + name + "! Your lucky number is " + luckyNumber + ".");
    }
}