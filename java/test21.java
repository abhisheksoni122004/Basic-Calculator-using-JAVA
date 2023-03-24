import java.util.Scanner;
public class test21 {
    // public static void main(String[] args)
   /*  // problem 1
        int n=4;
        for(int i=n;i>0;i--)
        {
        for(int j=0;j<i;j++)
        {
            System.out.println("*");
        }
            System.out.println("\n");

      }
    }
}*/


// problem 2 ;
/*public static void main(String[] args) {
    int sum=0;
    int n=4;
    for(int i=1;i<n;i++){
        sum =sum+(2*i);
    }
    System.out.println("Sum of even numbers are in Series just below the Line :\n"+sum);
    
}
}*/


//problem 3
public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 System.out.println("enter any number to Print any Table : " );
    int n=sc.nextInt();
    System.out.println("Enter the range of Table : ");
    int range=sc.nextInt();
    System.out.println("Table of " + n + " is :\n ");
    for(int i=1;i<=range;++i){
        System.out.println( n+" * " +i + " = " +n * i );
     } }
    
//  }
//  }
//problem 4
// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.println("enter any number to Print any Table : " );
//        int n=sc.nextInt();
//        System.out.println("Table of " + n + " is :\n ");
//        for(int i=10;i>=1;++i){
//            System.out.println( n+" * " +i + " = " +n * i );
//        }
       
// }}    

//problem 5---------> Done 
//problem 6---------> Done
//problem 7---------> Done
//problem 8---------> Done 

//problem 9 
// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      System.out.println("enter any number to Print any Table : " );
//         int n=sc.nextInt();
//         // System.out.println("Enter the range of Table : ");
//         // int range=sc.nextInt();
//         int sum=0;
//         System.out.println("Table of " + n + " is :\n ");
//         for(int i=1;i<=10;++i){
//             System.out.println( n+" * " +i + " = " +n * i );
//             sum+=n*i; 
//             System.out.println("Sum = " + sum);
//         }
//     }
//     }

}
