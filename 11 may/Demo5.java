import java.util.*;
public class Demo5 {
    public static void main(String[] args)
    {
        double b,h,a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base: ");
        b = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();

        a = 0.5*b*h;

        System.out.println("Area of triangle = "+ a);
    }
}
