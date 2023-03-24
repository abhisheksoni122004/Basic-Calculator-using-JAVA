import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.table.DefaultTableColumnModel;

public class test29 {

        
    
    /*static void change(int a){
        a=25;
    }
    static void change2(int [] arr){
        arr[0]=2004;
    }
    public static void main(String[] args) {
        int [] marks={10,12,15,456,};
        change2(marks);
        System.out.println(marks[0]);*/

        // static void foo(){
        //     System.out.println("Good morning Bro :) ");
        // }
        // static void foo(int a,int b){
        //     System.out.println("Good morning In  " + a + " Bhai");
        //     System.out.println("Good morning In  " + b + " Sir");
        // }
        // public static void main(String[] args) {
        //     foo();
        //     foo(2022,2023);
        // }
        
        public static void main(String[] args) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy\n\nHH:mm:ss");
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Indian Current Time\n\n" + formattedDate);
            

        
        }}
    

