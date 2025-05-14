import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 10th: ");
        double tenth = sc.nextDouble();

        System.out.print("Enter marks of 12th: ");
        double twelth = sc.nextDouble();

        System.out.print("Enter marks of Graduation: ");
        double graduate = sc.nextDouble();

        if (tenth >= 60 && twelth >= 60 && graduate >= 65) {
            System.out.println("You are eligible for interview");
        }else{
            System.out.println("You are not eligible for interview");
        }
    }
}


