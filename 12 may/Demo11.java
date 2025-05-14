import java.util.*;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of science: ");
        double science = sc.nextDouble();

        System.out.print("Enter marks of maths: ");
        double maths = sc.nextDouble();

        System.out.print("Enter marks of history: ");
        double history = sc.nextDouble();

        if(science >= 40 && maths >= 40 && history >= 40) {
            double total = (science + maths + history) / 3;

            if(total > 90 && total <= 100){
                System.out.println("Distinction class");
            }else if(total > 80 && total <= 90){
                System.out.println("First class");
            }else if (total > 70 && total <= 80) {
                System.out.println("Second class");
            }else if (total>= 40 && total <= 70) {
                System.out.println("Pass class");
            }
        }else{
            System.out.println("Sorry! you are get failed");
        }
    }
}



