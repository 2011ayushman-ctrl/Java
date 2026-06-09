import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        int sum=0;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int noOfsubjects = sc.nextInt();
        int marks[]=new int[noOfsubjects]; //initializing array
System.out.println("Enter the marks of" +noOfsubjects +" subjects.Press Enter to give marks for another subject");
//entering marks
for(int i=0;i<noOfsubjects;i++){
    marks[i]=sc.nextInt();
}//calculating sum
for(int j=0; j<noOfsubjects;j++){
    sum=sum+marks[j];
 } //generating result
 int percentage=(sum/noOfsubjects);
 //can also be written as 
 //int percentage=(sum/noOfsubjects*100)*100;
 System.out.println(percentage);
 if(percentage>=95){
    result="You scored 0 grade. Great Work!";

 }else if(percentage>90 && percentage<95){result="You scored A+. Well Done!";
 }
 //make sure to create grading for other marks too 
 //percentage can also be converted to gpa
 else{
    result="you passed";
 }
 System.out.println(result);
 }
 }