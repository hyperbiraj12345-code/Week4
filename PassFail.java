import java.util.Scanner;

public class PassFail{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks");
        float mark=s.nextFloat();
        if(mark<40){
            System.out.println("The person is fail");;
        }
        else{  
            
        }
        System.out.println("The person is pass");
    }
}