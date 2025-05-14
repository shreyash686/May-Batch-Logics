import java.util.*;
public class Demo6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        
        System.out.print("Enter no. of day: ");
        int day = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(day >= 1 && day <= 5){
            System.out.println("Weekday");

            if(age <= 13){
                System.out.println("Ticket price is 100rs");
            }else if(age > 13 && age <= 65){
                System.out.println("Ticket price is 150rs");
            }else{
                System.out.println("Ticket price is 130rs");
            }
        }else{
            System.out.println("Weekend");

            if(age <= 13){
                System.out.println("Ticket price is 120rs");
            }else if(age > 13 && age <= 65){
                System.out.println("Ticket price is 180rs");
            }else{
                System.out.println("Ticket price is 150rs");
            }
        }
    }
}
