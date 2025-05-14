import java.util.*;

public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        System.out.print("Enter the weight: ");
        double weight = sc.nextDouble();

        System.out.print("Enter the hemoglobin level: ");
        double hemoglobin = sc.nextDouble();

        if(age >= 18 && weight >= 50 && hemoglobin >= 12.5) {

            if(age >= 18 && age <= 60){
                System.out.println("Eligible");
            }else if(hemoglobin >= 12.5 && hemoglobin <= 18.5){
                System.out.println("Eligible");
            }else if (weight >= 50 && weight <= 90) {
                System.out.println("Eligible");
            }
        }else{
            System.out.println("Not eligible");
        }
    }
}



