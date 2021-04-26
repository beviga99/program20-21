/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

/**
 *
 * @author peralta.laura
 */
public class RectangleComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lenght, width, area, perimeter;
	lenght = 40.66;
	width = 10.55;
	
	  area = lenght * width;
	  perimeter = 2 * width + 2 * lenght;
	
      System.out.print("The area is ");  
      System.out.println(area);          
      System.out.print("The perimeter is ");
      System.out.println(perimeter);// TODO code application logic here
    }
    
}
