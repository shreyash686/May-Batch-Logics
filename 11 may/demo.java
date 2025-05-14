import java.util.*;
public class demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price:");
        double costPrice = sc.nextDouble();

        System.out.println("Enter the selling price:");
        double sellPrice = sc.nextDouble();

        double profitOrLoss = sellPrice - costPrice;

        if(profitOrLoss > 0)
        {
           System.out.println("Profit: "+profitOrLoss+ " rs.");
           System.out.println("Profit %" + (profitOrLoss/costPrice)*100);
        }
        else
        {
            System.out.println("Loss:" +(-profitOrLoss)+ " rs.");
            System.out.println("Loss %" + (-profitOrLoss/costPrice)*100);
        }
 
    }
}
