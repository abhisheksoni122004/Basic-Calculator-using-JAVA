import java.util.Scanner;
public class test8 {
    public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // System.out.println(a>10);
// int v,u

// int a=10;
// int b=5;

// System.out.println((a<<2)+(b>>2));
// System.out.println((b>0));
// System.out.println((a+b*100)/10);
// System.out.println(a&b);
Scanner in = new Scanner(System.in);


System.out.println("Enter Velocities :  ");
System.out.print("V = " );
double v = in.nextInt();
System.out.print("U = ");
double u = in.nextInt();
System.out.print("A = ");
double a = in.nextInt();
System.out.print("S = " );
double s = in.nextInt();
double k=Math.sqrt(v*v-u*u)/(2*a*s);
System.out.println("k =  " + k );




    }
}