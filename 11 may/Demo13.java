import java.util.*;

public class Demo13 {
    public static void main(String[] args) {
        double km, mtr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        km = sc.nextDouble();

        mtr = km * 1000;

        System.out.println(+km + " kilometer = " + mtr + " meter");
    }
}
