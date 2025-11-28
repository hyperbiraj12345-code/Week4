import java.util.Scanner;

public class TaxCalculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Income");
        int i=s.nextInt();
        if(i>0 && i<=500000)
        {
         System.out.println("The total payable tax is::"+(0.01*i));
        }
        else if(i>500000 && i<=700000){
            System.out.println("The total payable tax is::"+(5000+(0.1*(700000-i))));
        }
        else if(i>700000 && i<=1000000)
        {
            System.out.println("The total payable tax is::"+(15000+(0.2*(1000000-i))));
        }
        else if(i>1000000 && i<=2000000)
        {
            System.out.println("The total payable tax is::"+(35000+(0.3*(2000000-i))));
        }
        else if(i>2000000 && i<=5000000)
        {
            System.out.println("The total payable tax is::"+(335000+(0.36*(500000-i))));
        }
        else 
        {
            System.out.println("The total payable tax is::"+(1135000+(0.39*(i-5000000))));
        }
        
        
        
    }
}