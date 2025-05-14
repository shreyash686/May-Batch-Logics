import java.util.*;
public class Disc {
    public static void main(String[] args)
    {
        double costPrice,discount,discountRate;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the cost price: ");
        costPrice = sc.nextInt();
        System.err.println("Discount %: ");
        discountRate = sc.nextDouble();

        discount = costPrice - (costPrice*discountRate);

        System.out.println("Total discount = " + discount + " rs");

    }
}

