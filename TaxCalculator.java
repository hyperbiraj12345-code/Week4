import java.util.Scanner;

public class TaxCalculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Income");
        int income=s.nextInt();
        if(income<=500000)
        {
        int T1=(int)(0.1*income);
        }
         else if(income>500000 && income<=700000)
         {
        int Tax=(int)(5000+0.1*(700000-income));
         }
         else if(income>700000 && income<=1000000)
         {
        int Tax=(int)(15000+0.2*(1000000-income));
        }
        
        
        
        
        
    }
}