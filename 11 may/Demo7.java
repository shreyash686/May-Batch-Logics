import java.util.*;
public class Demo7 {
    public static void main(String[] args)
    {
        double area,a,perimeter;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides: ");
        a = sc.nextDouble();

        area = a*a;
        perimeter = 4*a;

        System.out.println("Area of square = "+ area);
        System.out.println("Perimeter of square = "+ perimeter);
    }
}


