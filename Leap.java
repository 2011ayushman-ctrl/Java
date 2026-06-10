    import java.util.Scanner;
    public class Leap {
public static void main(String[] args) {
int year;
System.out.println("enter the year ::");
Scanner sc = new Scanner(System.in);
year = sc.nextInt();

if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
System.out.println(year + " Specified year is a leap year");
else
System.out.println(year + "Specified year is not a leap year");
}
    }