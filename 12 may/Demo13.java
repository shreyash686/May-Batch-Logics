import java.util.*;

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age<12 || age>65){
            System.out.println("You get discount 10%");
        }else{
            System.out.println("You have to pay full price");
        }
    }
}




