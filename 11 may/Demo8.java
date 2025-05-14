import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        double radius, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();

        c = 2 * 3.14 * radius;

        System.out.println("Circumference = " + c);
    }
}
