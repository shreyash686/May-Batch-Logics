import java.util.*;

public class Demo14 {
    public static void main(String[] args) {
        double km, mtr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        mtr = sc.nextDouble();

        km = mtr * 0.001;

        System.out.println(+mtr + " meter = " + km + " kilometer");
    }
}
