package pattern;

public class SquarePattern {
    public static void main(String[] args) {
        

        int col = 1;
        int row = 1;
        
          // Outer loop to print each of the rows
       /* for (int row = 1; row <= size2; row++) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
        for (int col = 1; col <= size2; col++) {  // col = 1, 2, 3, ..., size
            System.out.print( "#" );   // Use print() without newline inside the inner loop
            
         }
        
         
      }*/
    do{
        do{
            System.out.print("#");
            
            row++;
        }while(row <= 5);        
        System.out.println(); 
        col++;
        row = 1;
    } while(col <= 5);
}
}
