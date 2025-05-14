import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        int i = n;

        int fact = 1;

        while (i >= 1) {
            fact *= i;
            i--;
        }
        System.out.println("Factorial of "+ n + " is " +fact);
    }
}

