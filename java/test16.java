import java.util.Random;
import java.util.Scanner;
public class test16 {
   private static final String nr = null;

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    System.out.println("USE-->\n\'0\' for rock \n\'1\' for PAPER \n\'2\' for Scissor ");
    System.out.println("Enter any number  : ");
    int user_input=sc.nextInt();
    int ai_input = random.nextInt(3);

    if(user_input ==ai_input){
        System.out.println("Match result : TIE ");
    }
    else if  (user_input == 0 && ai_input == 2 || user_input == 1 && ai_input == 0 || user_input == 2 && ai_input == 1 )
          {
            System.out.println("you win ");
          } else
           {
            System.out.println("you lose");
           }
        System.out.println("computer input---> "+ai_input);
 }
}



