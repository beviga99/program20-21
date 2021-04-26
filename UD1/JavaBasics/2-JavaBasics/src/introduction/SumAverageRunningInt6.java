package introduction;

public class SumAverageRunningInt6 {   
   public static void main (String[] args) {
   
    int sumOdd  = 0;
    int sumEven = 0;
    int absDiff;
    int lowerbound = 1;
    int upperbound = 100;
    
    for(int number = lowerbound; number <= upperbound; ++number) {
        
        if(number % 2 == 0) {
            sumOdd += number;
        } else {
            sumEven += number;
        }
    }
    if(sumOdd < sumEven){
        absDiff = sumEven - sumOdd;
    } else {
        absDiff = sumOdd - sumEven;
    }
    
    System.out.println("The difference is "+absDiff);
    System.out.println("The sum of odd numbers is "+ sumOdd);
    System.out.println("The sum of even numbers is "+ sumEven);
    
    }
   }
