public class test23 {        // Multi dimenttional Array
    public static void main(String[] args) {
        System.out.println();
        int [][] flats;
        flats=new int[2][4];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[0][3]=104;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        flats[1][3]=204;

        System.out.println("Printing  2-D array using for loops ");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }










    }
    
}
