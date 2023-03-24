import java.util.Random;
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
   // try (Scanner sc = new Scanner(System.in)) {
      /*     System.out.println("Enter your age :");
        int age=sc.nextInt();

        switch (age) {
            case 1:
            System.out.println("you are good boy");
                break;
            case 2:
            System.out.println("your are adult");
               break;
               case 3:
            System.out.println("You are engineer");
            default:
                break;
        }




        /*if(a>56){
            System.out.println("your are Experienced Person ");
        }  else if(a>46){
            System.out.println("you are Semi-Experienced Person ");
            }
           else if(a>36){
            System.out.println("Semi-Semi-Experienced Person");
            }
            else if(a>25){
                System.out.println("Abhi tu bussiness kar ");
            }
            else if(a>20){
                System.out.println("Carrer set kar apna ");
            }
            else if(a>13){
                System.out.println("10th pass kar le....");
            }
            else if(a>14){
                System.out.println("Maje kar.....");
            }
            else if(a>10){
                System.out.println("Choota Bheema , Doremon dekh abhi.....ja  ");
            }*/
        // }

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("USE--->\n \'0\' for ROCK \n \'1\' for PAPER \n \'2\' for SCICCOR");
        System.out.println("ENTRE YOUR INPUT BELOW ");
        int user_input = sc.nextInt();
        int  ai_input = random.nextInt(3);

        if (user_input == ai_input)
          {
            System.out.println("match result: TIE ");
          }else if  (user_input == 0 && ai_input == 2 || user_input == 1 && ai_input == 0 || user_input == 2 && ai_input == 1 )
          {
            System.out.println("you win ");
          } else
           {
            System.out.println("you lose");
           }
        System.out.println("computer input---> "+ai_input);
       // System.out.println("thanks for playing game ");


}
  }
        
    
  
 