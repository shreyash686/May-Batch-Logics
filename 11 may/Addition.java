import java.util.*;

public class Addition {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no:");

        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;

        System.out.println("c=" + c);
    }
}