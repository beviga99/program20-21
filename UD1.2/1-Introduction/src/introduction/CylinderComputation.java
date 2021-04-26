package introduction;
public class CylinderComputation {
    public static void main(String[] args) {
        double radious, height, surfaceArea, baseArea, volume;
        radious = 25;
        height = 45;
        final double PI = 3.14159265;
        
        surfaceArea = 2 * PI * radious * height + 2 * PI *radious *radious;
        volume = PI * radious * radious;
        baseArea = radious * radious * PI;
        
        System.out.print("The surface area is ");
        System.out.println(surfaceArea);
        System.out.print("The volume is ");
        System.out.println(volume);
        System.out.print("The base area is ");
        System.out.println(baseArea);
    }
}