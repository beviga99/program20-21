package array;

public class Bat {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 7, 8, 3};//se puede poner así, de manera abreviada, o como abajo
        zenbakiak = new int[4];
        zenbakiak[0]=1;
        zenbakiak[1]=7;
        zenbakiak[2]=8;
        zenbakiak[3]=3;
        int batuketa = 0;
        int batuketa2 = 0;
        int batuketa3 = 0;
        int batuketa4 = 0;
       
        //for erabilita
        System.out.print("zenbakien batuketa: ");
        for (int i=0;i<zenbakiak.length;i++) {
            batuketa += zenbakiak[i];
        }
        System.out.print(batuketa);
        System.out.println();

   
        //while erabilita
        int c=0;
        while (c<zenbakiak.length) {
             batuketa2 += zenbakiak[c];
             ++c;
        }
        System.out.print("Zenbakien batuketa: " + batuketa2);
        System.out.println();
    
        //do while erabilita
        int x = 0;
        do {
           batuketa3 += zenbakiak[x];
           x++;
            
        } while (x<zenbakiak.length);
        System.out.print("Zenbakien batuketa: " + batuketa3);
        System.out.println();
        
        //for-each erabilita
        for (int zenbaki : zenbakiak) {
            batuketa4 += zenbaki;
        }
        System.out.print("Zenbakien batuketa: " + batuketa4);
        System.out.println();
    }
}