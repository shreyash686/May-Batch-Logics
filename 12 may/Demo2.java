import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println("Max element is: " + max);
    }
}
