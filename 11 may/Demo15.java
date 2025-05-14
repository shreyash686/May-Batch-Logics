import java.util.*;

public class Demo15 {
    public static void main(String[] args) {
        double r, a, h;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        r = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();

        a = 2 * 3.14 * r * h + 2 * 3.14 * r * r;

        System.out.println("Surface area of cylinder = " + a);
    }
}
