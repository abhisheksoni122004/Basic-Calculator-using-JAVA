import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        n=sc.nextInt();

        for(i=0;i<=n;i++){
            if((i%2)==1){
                sum+=i;
            }
        }
        System.out.println("sum of odd Number is : " + sum);
    }
}

