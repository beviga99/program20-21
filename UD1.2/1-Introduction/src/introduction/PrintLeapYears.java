package introduction;
public class PrintLeapYears {  
   public static void main(String[] args) {
      int lowerbound = 999, upperbound = 2010; 
      int count = 0;    
      int year = lowerbound;    
           while (year <= upperbound) {
           if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
               count++;
               System.out.println(year);
            }
           year++;
      } 
    System.out.println("The sum of all the years is " + count);  
   }
}
