
import java.util.HashSet;
import java.util.Set;


public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
    
    public MyCircle() {
        
    }
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(int radius) {
        this.radius = radius;
    }
    public double distance(MyPoint another) {
        return center.distance(another);
    }
    public boolean isInside(MyPoint puntua) {
        if(puntua.distance(puntua) <= 1) {
            return true;
        } else {
            return false;
        }
    }
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
    public MyPoint getCenter() {
        return this.center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int[] getCenterXY() {
        int[] XY = new int[2];
        XY[0] = center.getX();
        XY[1] = center.getY();
        return XY;
    }
    public double getCircunference() {
        return 2 * Math.PI * this.radius;
    }
    public int getRadius() {
        return this.radius;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public void setCenter(int x) {
        this.center = new MyPoint(x, 0);
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
        
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Radius: " + this.radius + ", Center[" + this.center.getX() + ", " + this.center.getY();
    }
}
