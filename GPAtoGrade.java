import java.util.Scanner;

public class GPAtoGrade{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the GPA");
        float GPA=s.nextFloat();
        if(GPA>0 && GPA<=4)
        {
            System.out.println("Valid GPA");
        }
        else{
            System.out.println("Invalid GPA");
        }
        if(GPA>3.6 && GPA<=4){
         System.out.println("The grade is A");   
        }
        else if(GPA>3.2 && GPA<=3.6) {
         System.out.println("The grade is B");
        }
        else if(GPA>2.8 && GPA<=3.2)
        {
            System.out.println("The grade is C");
        }
        else if(GPA>2.4 && GPA<=2.8)
        {
            System.out.println("The grade is D");
        }
        else if(GPA>2 && GPA<=2.4)
        {
            System.out.println("The grade is E");
        }
        else if(GPA>1.6 && GPA<=2)
        {
            System.out.println("The grade is F");
        }
        else if(GPA>0 && GPA<=1.6)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("GPA not in between 0 and 4");
        }
        
    }
}