import java.util.Scanner;

public class PN0{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        if(num>0){
         System.out.println(num+" is positive");   
        }
        else if(num<0) {
         System.out.println(num+" is negative");
        }
        else{
            System.out.println("Number is 0");
        }
        
    }
}