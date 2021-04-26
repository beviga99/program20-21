public class RectangleComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double leght, width, area, perimeter;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
    
      width = 3.5;
      // Assign a value to radius. (We shall read in the value from the keyboard later.)
      leght = 1.2;
      // Compute area and circumference
      area = leght * width;
      perimeter = leght + leght + width + width;
      
      // Print results
      System.out.print("The width is ");  // Print description
      System.out.println(width); 
      System.out.print("The leght is ");  // Print description
      System.out.println(leght);  
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
}
