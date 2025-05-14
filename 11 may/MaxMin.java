import java.util.*;
public class MaxMin
 {
    public static void main(String[] args) 
    {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the a:");
      a = sc.nextInt();
      System.out.println("Enter the b:");
      b = sc.nextInt();

      if (a>b) {
         System.out.println(a +" is maximum no");
      }
      else if (b>a) {
         System.out.println(b +" is maximum no");
      }
      else{
         System.out.println(a + " and " + b + " are equal no");
      }
    }     
 }

