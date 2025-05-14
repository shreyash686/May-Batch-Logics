import java.util.*;
public class divisible_by_17
 {
    public static void main(String[] args) 
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no:");
      n = sc.nextInt();

      if (n%17==0) {
         System.out.println(n +" is divisible by 17");
      }
      else{
         System.out.println(n +" is not divisible by 17");
      }
    }     
 }
