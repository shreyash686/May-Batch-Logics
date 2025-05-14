import java.util.*;
public class D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the loan amount:");
        double loan = sc.nextDouble();

        System.out.println("Enter duration:");
        double duration = sc.nextDouble();

        double interest = loan * 0.1;

        double EMI = (loan + interest)/ duration;

        System.out.println("Interest: " +interest+" rs.");
        System.out.println("EMI: "+EMI+ " rs.");

    }
}
