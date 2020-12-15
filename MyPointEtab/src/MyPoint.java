
public class MyPoint {
    private int x, y;
    
    public void MyPoint() {
        x = 0;
        y = 0;
    }
    public void MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance() {
        
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double distance(MyPoint another) {
       return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2)); 
    }
    
}
