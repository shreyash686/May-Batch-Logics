import java.util.*;

public class Demo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter start: ");
        int i = sc.nextInt();

        System.out.print("Enter end: ");
        int n = sc.nextInt();

        while (i >= n) {
            System.out.println("i: "+ i);
            i--;
        }
    }
}

