import java.util.*;

public class Demo16 {
    public static void main(String[] args) {
        double a, t, d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the acceleration: ");
        a = sc.nextDouble();
        System.out.println("Enter the time: ");
        t = sc.nextDouble();

        d = 0.5 * a * t * t;

        System.out.println("Distance = " + d);
    }
}
