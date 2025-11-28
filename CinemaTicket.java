import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        float price = 0f;
        float price1 = 0f;
        float price2 = 0f;
        float price3 = 0f;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age group Child/Adult/Senior");
        String age = s.nextLine();

        if(age.equals("Child")) {
            price = 150;
        } 
        else if(age.equals("Adult")) {
            price = 250;
        } 
        else if(age.equals("Senior")) {
            price = 200;
        } 
        else {
            System.out.println("Wrong age group");
        }
        System.out.println("Enter the movie language Nepali/English/Hindi");
        String lan = s.nextLine();
        if(lan.equals("Nepali")) {
            price1 = price;
        } 
        else if(lan.equals("Hindi")) {
            price1 = price + 50;
        } 
        else if(lan.equals("English")) {
            price1 = price + 100;
        } 
        else {
            System.out.println("Invalid language");
        }

        System.out.println("Do you have student ID (Yes/No)?");
        String id = s.nextLine();
        if(id.equals("Yes")) {
            price2 = price1 - 0.2f * price1;   
        } else {
            price2 = price1;
        }
        System.out.println("Are you watching on a festival (Yes/No)?");
        String fes = s.nextLine();
        if(fes.equals("Yes")) {
            price3 = price2 - 0.15f * price2;  
        } else {
            price3 = price2;
        }
        System.out.println("Total movie fare is: " + price3);
    }
}
