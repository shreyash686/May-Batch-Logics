import java.util.*;

public class Demo12 {
    public static void main(String[] args) {
        double liter, mililiter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        mililiter = sc.nextDouble();

        liter = mililiter * 0.001;

        System.out.println(+mililiter + " mililiter = " + liter + " liter");
    }
}

