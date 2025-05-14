import java.util.*;

public class Demo17 {
    public static void main(String[] args) {
        double rs, dr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dollor: ");
        dr = sc.nextDouble();

        rs = dr * 85.42;

        System.out.println(+dr + " dollor = " + rs + " inr");
    }
}
