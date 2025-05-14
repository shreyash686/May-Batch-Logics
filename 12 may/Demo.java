import java.util.*;

public class Demo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (a>b) {
            if(a>c){
                System.out.println("A is max");
            }else{
                System.out.println("C is max");
            }
        }else{
            if (a>c) {
                System.out.println("B is max");
            }else{
                System.out.println("C is max");
            }
        }
    }
}