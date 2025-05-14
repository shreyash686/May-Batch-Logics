import java.util.*;
public class Divisible
 {
    public static void main(String[] args) 
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no:");
      n = sc.nextInt();

      if ((n%5==0)&&(n%7==0)) {
         System.out.println(n +" is divisible by 5 or 7");
      }
      else{
         System.out.println(n +" is not divisible by 5 or 7");
      }
    }     
 }

