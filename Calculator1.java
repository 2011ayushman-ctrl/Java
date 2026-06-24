import java.util.Scanner;
import java.lang.Math;
class Input
{
        static int a,b;

        static Scanner sc = new Scanner(System.in);
        static void input1()
        {
                System.out.print("Enter First Number: ");
                a = sc.nextInt();
                System.out.print("Enter Second Number: ");
                b = sc.nextInt();
        }
        static void input2()
        {
                System.out.print("Enter a Number: ");
                a = sc.nextInt();
        }
        static int add(int a,int b)
        {
                return a+b;
        }
        static int sub(int a,int b)
        {
                return a-b;
        }
        static int mul(int a,int b)
        {
                return a*b;
        }
        static int div(int a,int b)
        {
                return a/b;
        }
        static int sqr(int a)
        {
                return a*a;
        }
        static double sqroot(double a)
        {
                return Math.sqrt(a);
        }
}
class Calculator extends Input
{
        static double c;
        static void input3()
        {
                System.out.println("Enter a Number: ");
                c = sc.nextDouble();
        }

        public static void main(String...args)
        {
                System.out.println("***** Welcome to Codingal Basic Calculator *****");
                System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Square \n6. Square Root");
                int m = sc.nextInt();
                switch(m)
                {
                        case 1:
                                input1();
                                System.out.println("\n"+a+"+"+b+"="+add(a,b));
                                break;
                        case 2:
                                input1();
                                System.out.println("\n"+a+"-"+b+"="+sub(a,b));
                                break;
                        case 3:
                                input1();
                                System.out.println("\n"+a+"*"+b+"="+mul(a,b));
                                break;
                        case 4:
                                input1();
                                System.out.println("\n"+a+"/"+b+"="+div(a,b));
                                break;
                        case 5:
                                input2();
                                System.out.println("\nSquare of "+a+"="+sqr(a));
                                break;
                        case 6:
                                input2();
                                System.out.println("\nSquare root of "+a+"="+sqroot(a));
                                break;

                        default:
                                System.out.println("Wrong Entry");
                }
        }
}
