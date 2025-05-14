import java.util.*;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int n = sc.nextInt();

        System.out.print("Enter end: ");
        int m = sc.nextInt();

        int sum = 0;

        while (n <= m) {
            sum += n;
            n++;
        }
        System.out.println("Sum: " + sum);
    }
}
