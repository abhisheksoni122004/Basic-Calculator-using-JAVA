import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    double num1,num2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Numbers");
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();
    System.out.println("Choose the Operator (+ , - , * , / )");
    char op=sc.next().charAt(0);
    double o=0;
    switch (op){
      case '+':
        o=num1+num2;
        break;
      case '-':
        o=num1-num2;
        break;
        case '*':
        o=num1*num2;
        break;
        case '/':
        o=num1/num2;
        break;

        default:
        System.out.println("Your input is Wrong ");

      }
      System.out.println("the final Result : ");
      System.out.println();
      System.out.println(num1 + " " + op + " " + num2
      + " = " + o); 
    }


}