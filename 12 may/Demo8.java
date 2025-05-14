import java.util.*;

public class Demo8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("A is max");
                }else{
                    System.out.println("D is max");
                }
            }else{
                if(c>d){
                    System.out.println("C is max");
                }else{
                    System.out.println("D is max");
                }
            }
        }else{
            if(b>c){
                if(b>d){
                    System.out.println("B is max");
                }else{
                    System.out.println("D is max");
                }
            }else{
                if(c>d){
                    System.out.println("C is max");
                }else{
                    System.out.println("D is max");
                }
            }
            }
        }
    }


