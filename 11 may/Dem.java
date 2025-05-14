import java.util.*;
public class Dem {
    public static void main(String[] args)
    {
        double sales,commisionRate,commision;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the monthly sales: ");
        sales = sc.nextDouble();
        System.out.println("Enter the comission %: ");
        commisionRate = sc.nextDouble();

        commision = sales * commisionRate;

        System.out.println("Commision = " + commision + " rs");

    }
}


