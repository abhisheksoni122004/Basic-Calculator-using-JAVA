/*import java.util.Scanner;
public class test15 {
    public static void main(String args[]){
    
       //PROBLEM 1
       int a=11;
       if(a>=11){
         System.out.println("I am 11 ");
       }
       else{
         System.out.println("i am not 11");
       }
       
      //PROBLEM 1
      Scanner sc=new Scanner(System.in);
      byte m1,m2,m3;
      System.out.println("Enter your marks physics : ");
      m1=sc.nextByte();
      System.out.println("Enter your marks Maths : ");
      m2=sc.nextByte();
      System.out.println("Enter your marks Chemistry : ");
      m3=sc.nextByte();
      float avg=(m1+m2+m3)/3.0f;
      if(avg>40 && m1>=33 && m2>=33 && m3>=33){
        System.out.println("Congratulations, You have been Promoted ");
      }
      else{
        System.out.println("Sorry , you are not Promoted");
      }
      System.out.println("Your overall Percentage is "  + avg );
      

      //PROBLEM 3

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Amount ");
      float income=sc.nextFloat();
      float tax=3.3f;
      if(tax<=2.5f){
        tax = tax + 0;
      }
      else if(income>2.5f && income <=5f){
        tax = tax+0.05f*(income-2.5f);
      }
      else if(income>5.0f && income <=10.0f){
        tax = tax+0.05f*(5.0f-2.5f); 
        tax = tax+0.02f*(income-2.5f); 
      }
      else if(income>=10.0f){
        tax = tax+0.05f*(5.0f-2.5f); 
        tax = tax+0.2f*(10.0f-5f); 
        tax = tax+0.3f*(income-10.0f); 
      }
      System.out.println("Total tax Paid by the person : " + tax );
      

      //Problem 4

      Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();
      switch (age) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
      
        default:
            break;
      }
      
    //problem 6
    Scanner sc = new Scanner(System.in);
    String website=sc.next();
    if(website.endsWith(".org")){
        System.out.println("this is an Organizational Website ");
    }
    else if(website.endsWith(".com")){
        System.out.println("this is an Commercial Website ");
    }
    else if(website.endsWith(".in")){
        System.out.println("this is an Indian  Website ");
}

    }

}
*/