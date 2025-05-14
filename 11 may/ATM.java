import java.util.*;

public class Atm {
    public static void main(String[] args) {
        double cb, wb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current balance:");
        System.out.println("Enter widraw balance:");
        cb = sc.nextDouble();
        wb = sc.nextDouble();
        if (cb > wb) {
            System.out.println(cb + " can be widraw");
        } else {
            System.out.println(cb + " insufficient amount");
        }

    }
}
