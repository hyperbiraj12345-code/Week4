import java.util.Scanner;

public class ScholarshipCheck{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the GPA");
        float GPA=s.nextFloat();
        System.out.println("Enter the attendance in %");
        float a=s.nextFloat();
        System.out.println("Enter the attitude between 1 to 10");
        int att=s.nextInt();
        if(GPA>=3.2)
        {
         System.out.println("GPA>3.2");
         if(a>80)
         {
             System.out.println("Attendance>80%");
         }
         else{
             System.out.println("Attendance<80%");
         }
         if(att>5)
         {
             System.out.println(" Attitude Score>5"); 
         }
         else{
             System.out.println("Attitude Score<5"); 
         }
        }
        else{
        System.out.println("GPA is less than 3.2");
        }
        if(GPA>=3.2 && a>80 && att>5)
        {
        System.out.println("Eligibile for scholarship");
        }
        else{
            System.out.println("Not eligible for scholarship");
        }
    }
}