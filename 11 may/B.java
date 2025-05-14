import java.util.*;
public class B
 {
    public static void main(String[] args) 
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the a:");
      a = sc.nextInt();
      System.out.println("Enter the b:");
      b = sc.nextInt();
      System.out.println("Enter the c:");
      c = sc.nextInt();

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


