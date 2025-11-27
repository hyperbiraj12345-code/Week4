import java.util.Scanner;
public class PaperCheck{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the paper size for example 0 for A0 ,1 for A1 etc upto A5");
        int size=s.nextInt();
        switch(size)
        {
        case 0:
            System.out.println("Size of A0 is 841 x 1189 mm (33.1 x 46.8 inches)");
        break;
         case 1:
          System.out.println("Size of A1 is 594 x 841 mm (23.4 x 33.1 inches)") ;  
          break;
          case 2:
          System.out.println("Size of A2 is 420 x 594 mm (16.5 x 23.4 inches)") ; 
          break;
          case 3:
          System.out.println("Size of A3 is 297 x 420 mm (11.7 x 16.5 inches)") ;
          break;
          case 4:
          System.out.println("Size of A4 is  210 x 297 mm (8.3 x 11.7 inches) ") ; 
          break;
          case 5:
          System.out.println("Size of A5 is : 148 x 210 mm (5.8 x 8.3 inches)") ; 
          deafult:
          System.out.println("Wrong Input");
          
        }
        
        
    }
}