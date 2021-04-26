public class MyCylinder extends MyCircle {
   
   private double height;

   
   public MyCylinder() {
      super();  
      this.height = 1.0;
   }
   public MyCylinder(double height) {
      super();  
      this.height = height;
   }
   public MyCylinder(double height, int radius) {
      super(radius);  
      this.height = height;
   }

   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   public double getVolume() {
      return getArea()*height; 
   }

   public double getArea() {
       return 2 * super.getArea() * (super.getRadius() * this.height);
   }
   
   public String toString() {
      return "This is a Cylinder"; 
   }
}