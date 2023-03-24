public class test12 {
public static void main(String args[]){
// PROBLEM 1 
String ji="ABHISHEK SONI";
System.out.println(ji.toLowerCase());


// PROBLEM 2
String soni = "Abhishek soni is an  Software Engineer";
System.out.println(soni.replace(" ","_"));

// PROBLEM 3
String name = "Dear <|name|> , Thanks lot";
name=name.replace("<|name|>","Abhishek");
System.out.println(name);

// PROBLEM 4

String abhi = "Abhishek soni   is an       Software Engineer";
System.out.println(abhi.indexOf("   "));
System.out.println(abhi.indexOf("       "));

// PROBLEM 5

System.out.println("\"Dear abhishek , You can complete Your Course \"");
   }
}
