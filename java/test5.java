import java.util.Scanner;

public class test5 {
    //precedence of associativity  
public static void main(String args[]){
    // Scanner in = new Scanner(System.in);
    // int x , y , k ;
    // System.out.println("Enter the number X and Y : ");
    // x = in.nextInt();
    // y = in.nextInt();
    // k = x*y/2 ;
    // System.out.println(k);
    
    int a , b , c , k;
    System.out.println("Enter the number b and a  then C : ");

    Scanner in = new Scanner(System.in);
    System.out.print("b = ");
    b=in.nextInt();
    System.out.print("a = ");
    a=in.nextInt();
    System.out.print("c = ");
    c=in.nextInt();
    k=b*b-(4*a*c)/(2*a);
    System.out.println(k + " is the Quadratic Equation Solution  " );
     }
}
