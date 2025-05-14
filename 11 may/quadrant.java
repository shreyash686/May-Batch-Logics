import java.util.*;
public class Quadrant {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x & y:");

        x = sc.nextInt();
        y = sc.nextInt();
        if ((x>0)&&(y>0)) {
            System.out.println(x + "and" + y +" in first quadrant");
        } 
        else if ((x<0)&&(y>0)) {
            System.out.println(x + "and" + y +" in second quadrant");
        }
        else if ((x<0)&&(y<0)) {
            System.out.println(x + "and" + y +" in third quadrant");
        }
        else if ((x>0)&&(y<0)) {
            System.out.println(x + "and" + y +" in fourth quadrant");
        }
        else
        {
            System.out.println(x + "and" + y +" is origin");
        }
    

    }
}

