import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.err.println("It is not a vowel");
        }
    }
}
