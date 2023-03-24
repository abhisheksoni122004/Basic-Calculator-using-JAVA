import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.xml.transform.Source;
public class test28 {
      public static void main(String[] args) {
       //System.out.println("hello");
      /*  int start=101;
       int end=200;
       System.out.println("Odd Number from 101 to 200  ");
       for(int i=0;i<=end;i++){
        if(i%2==1){
         
            System.out.println(i);
        }
       }
    
       

    }}

    

 
         private String name;
          String age;
          double fee;
 
        public test28(String name,String string,double fee){
        this.name=name;
        this.age=string;
        this.fee=fee;    
    }
        public void displaydata(){
        System.out.println("Name=" + name);
        System.out.println("Age=" +age);
        System.out.println("fee=" + fee);
        }
        public static void main(String[] args) {
            test28 s1=new test28("Abhishek Soni", "12", 120000);
            s1.displaydata();
        }
    



    */

////              ..............................Reverse Of a ny keywords............................. 2 Ways
    /*String str;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a string : ");
	str=scan.nextLine();	
	char[] ch=str.toCharArray(); 
	System.out.println("Reverse of a String is :"); 
	int j=ch.length;
	for(int i=j;i>0;i--)
	{
	System.out.print(ch[i-1]); 
	}
	*/

    // String str;
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter any number");
    // str=sc.nextLine();
    // System.out.println("Reverse number is " + str + " is : ");
    // int i=str.length();
    // while(i>0)
    // {
    //     System.out.print(str.charAt(i-1));
    //     i--;
    // }


    

    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Ente the String : ");
    str=sc.nextLine();
    System.out.println("Reverse number of : " + str + " is : ");
    int i=str.length();
    while(i>0)
    {
    System.out.print(str.charAt(i-1));
    i--;
    }

}}
 
