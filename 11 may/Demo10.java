import java.util.*;

public class Demo10 {
    public static void main(String[] args) {
        double v, r, h;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        r = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();

        v = 3.14 * r * r * h;

        System.out.println("Volume of cylinder = " + v);
    }
}
