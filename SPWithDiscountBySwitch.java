import java.util.Scanner;
public class SPWithDiscountBySwitch{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the MP of item");
        float p=s.nextFloat();
        System.out.println("Enter the category of item from A to D");
        char c=s.next().charAt(0);
        switch(c)
        {
         case 'A':
          System.out.println("The SP with D=60% is::"+(p-0.6*p)); 
          break;
          case 'B':
           System.out.println("The SP with D=40% is::"+(p-0.4*p)); 
          break;
          case 'C':
          System.out.println("The SP with D=20% is::"+(p-0.2*p)); 
          break;
          case 'D':
          System.out.println("The SP with D=10% is::"+(p-0.1*p)); 
          break;
          default:
          System.out.println("Category is not in A and D");
          
        }
        
        
    }
}