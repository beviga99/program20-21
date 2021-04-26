package javabasics;
import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
       double radius, height, baseArea, surfaceArea, volume; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();
        System.out.println("Enter the height: ");
        height = in.nextDouble();
    
       baseArea = Math.PI * radius * radius;
       surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
       volume = baseArea * height; 
        
      System.out.printf("Surface Area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);
       System.out.printf("Base Area is: %.2f%n", baseArea);
    }
}

