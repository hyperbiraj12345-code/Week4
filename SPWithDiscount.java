import java.util.Scanner;
public class SPWithDiscount{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the category of item from A to D");
        char item=s.next().charAt(0);
        System.out.println("Enter the MP of item");
        float p=s.nextFloat();
        if(item=='A'){
            System.out.println("The SP with D=60% is::"+(p-0.6*p));
        }
            else if(item=='B')
            {
             System.out.println("The SP with D=40% is::"+(p-0.4*p));   
            }
            else if(item=='C')
            {
             System.out.println("The SP with D=20% is::"+(p-0.2*p));   
            }
            else 
            {
             System.out.println("The SP with D=10% is::"+(p-0.1*p));   
            }
           
        }
        }  
    
        
       
