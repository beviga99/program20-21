package javabasics;
import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
       double radius, volume, surfaceArea; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        radius = in.nextDouble(); 
    
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius; 
        
      System.out.printf("Surface Area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);
    }
}
