import java.util.*;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        while (i <= 10) {
            System.out.println(i * n);
            i++;
        }

    }
}
