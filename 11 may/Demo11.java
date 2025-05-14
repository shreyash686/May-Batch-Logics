import java.util.*;

public class Demo11 {
    public static void main(String[] args) {
        double liter, mililiter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        liter = sc.nextDouble();

        mililiter = liter * 1000;

        System.out.println(+liter + " liter = " + mililiter + " mililiter");
    }
}
