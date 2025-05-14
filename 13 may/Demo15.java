import java.util.*;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i = 0;
        int  pow;

        while (i <= n) {
            pow = n*i;
            i++;
        }
        System.out.println("S: " + pow);
    }
}

