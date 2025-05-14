import java.util.*;
public class Demo6 {
    public static void main(String[] args)
    {
        double l,w,a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lengh: ");
        l = sc.nextDouble();
        System.out.println("Enter the width: ");
        w = sc.nextDouble();

        a = l*w;

        System.out.println("Area of rectangle = "+ a);
    }
}

