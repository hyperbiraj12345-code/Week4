import java.util.Scanner;

public class DivisibleBy3Or5{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        if(num%3==0 && num%5==0){
         System.out.println(num+" is both divisible by 3 and 5");   
        }
        else if(num%3==0 && num%5!=0 ) {
         System.out.println(num+" is divisible by 3 but not by 5 ");    
        }
        else if(num%3!=0 && num%5==0){
            System.out.println(num+" is divisible by 5 but not by 3");
        }
        else
        {
         System.out.println(num+" is neither divisible by 5 nor by 3");   
        }
    }
}