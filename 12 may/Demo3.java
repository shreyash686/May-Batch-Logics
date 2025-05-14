import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of python: ");
        double python = sc.nextDouble();

        System.out.print("Enter marks of java: ");
        double java = sc.nextDouble();

        System.out.print("Enter marks of dsa: ");
        double dsa = sc.nextDouble();

        if(python >= 40 && java >= 40 && dsa >= 40) {
            double total = python + java + dsa;
            double percentage = (total/3);
            System.out.println("%: "+ percentage);

            if(percentage > 90 && percentage <= 100){
                System.out.println("Distinction class");
            }else if(percentage > 80 && percentage <= 90){
                System.out.println("First class");
            }else if (percentage > 70 && percentage <= 80) {
                System.out.println("Second class");
            }else if (percentage > 40 && percentage <= 70) {
                System.out.println("Pass class");
            }
        }else{
            System.out.println("Sorry! you are get failed");
        }
    }
}

