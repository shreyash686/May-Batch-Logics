import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        double r, a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        r = sc.nextDouble();

        a = 4 * 3.14 * r * r;

        System.out.println("Surface area of sphere = " + a);
    }
}
