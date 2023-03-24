public class test22 {
public static void main(String[] args) {
      int[] marks ;
      marks new int[5];
      marks[0]=10;
      marks[1]=00;
      marks[2]=30;
      marks[3]=40;
      marks[4]=50;

      int [] marks ={0,45,58,69,78};
      System.out.println(marks[2]);
      System.out.println(marks.length); 

      int [] marks ={85,68,99,78,86,};
      float [] marks ={85.2f,68.3f,99.6f,78.6f,86.5f,};
      System.out.println(marks[2]);

      String [] students =  {"Abhishek","rohit","Akshat","Boby","Pushpendra"};
      System.out.println(students.length);
      System.out.println(students[1]);

        int [] marks ={10,20,30,40,50};
        System.out.println("Printing  using for loop ");
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);

        System.out.println("Printing  using for loop ");
        for(int i=marks.length-1;i>=0;i--){
        System.out.println(marks[i]);
    
        System.out.println("Printing  using for loop ");
        for(int i=marks.length-1;i>=0;i--){
        System.out.println(marks[i]);


        System.out.println("Printing  using for-each loop ");
        for(int element:marks){
        System.out.println(element);
        }
    }}