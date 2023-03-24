public class Student {
    private String name;
    private int age;
    private double fee;
    
      public Student(String name, int age, double fee) {
        this.name = name;
          this.age = age;
            this.fee = fee;
    }
    
     public void displayData() {
        System.out.println("Name: " + name);
           System.out.println("Age: " + age);
              System.out.println("Fee: " + fee);
    }

    public static void main(String[] args) {
        // create object s1
        Student s1 = new Student("John", 20, 1000.0);
        s1.displayData();

        // create object s2
        Student s2 = new Student("Jane", 19, 1500.0);
        s2.displayData();
    }
}