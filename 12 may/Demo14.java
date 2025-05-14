import java.util.*;
public class Demo14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Jan");
        System.out.println("2. Feb");
        System.out.println("3. March");
        System.out.println("4. Apr");
        System.out.println("5. May");
        System.out.println("6. June");
        System.out.println("7. Jul");
        System.out.println("8. Aug");
        System.out.println("9. Sept");
        System.out.println("10. Octo");
        System.out.println("11. Nov");
        System.out.println("12. Dec");
        
        System.out.print("Enter no. of day: ");
        int month = sc.nextInt();
        
        if (month == 1 || month == 3 || month == 5 || 
            month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days 31");
        } else if (month == 4 || month == 6 || 
                   month == 9 || month == 11) {
            System.out.println("Number of days 30");
        } else if (month == 2) {
            System.out.println("Number of days 28");
        } else {
            System.out.println("Invalid month number!");
        }
    }
}

