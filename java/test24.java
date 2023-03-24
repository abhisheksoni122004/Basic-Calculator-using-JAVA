import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.Source;

public class test24 {
    public static void main(String[] args) {
        //problem 1
       /*  float []marks={10.2f,20.5f,30.5f,40.5f,50.9f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }System.out.println("the Sum of float Numbers " + sum );
     }}

     public static void main(String[] args) {
        //problem 1
        float []marks={10.2f,20.5f,30.5f,40.5f,50.9f};
        float num=10.2f;
        boolean isInArray=false;
        for(float element:marks){
            if(num==element){
                isInArray=true;
                break;
            }
            if(isInArray){
                System.out.println("the value is Present in Array " );
            }
            else{
                System.out.println("the vale is not Present in Array");
            }
        }
    }

    //problem 3
    public static void main(String[] args) {
        float []marks={90.2f,80.5f,95.5f,85.5f,75.9f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }System.out.println("the Average of physic Numbers " + sum/marks.length);
        
    }

    //problem 4 

    // public static void main(String[] args) {
        
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        
        int [][] mat2={{2,4,5},
                      {4,2,2}};
        int [][] result={{0,0,0},
                      {0,0,0}};
        for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
            result[i][j]=mat1[i][j] + mat2[i][j];
            System.out.print(result[i][j] + " ");
           
        }
        System.out.println("");
      }
    

   // problem 6

 /*   public static void main(String[] args) {
    int [] arr ={1,2,3,4,5,6};
    int l=arr.length;
    int n=Math.floorDiv(l, 2);
    int temp;

    for(int i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
    }
    for(int element:arr){
        System.out.print(element + " ");
     }
    */ // } 
     

     //problem 7
//      public static void main(String[] args) {
        
     
//      int [] arr ={11,2,42,7,5};
//      int min=Integer.MAX_VALUE;              // Integer.MIN_VALUE is used to find from negative values also 
//      for(int e:arr){
//         if(e<min){
//             min=e;
//         }
//      } System.out.print("the Maximum number in this array is " + min );

    Scanner sc = new Scanner(System.in);



    }
 }