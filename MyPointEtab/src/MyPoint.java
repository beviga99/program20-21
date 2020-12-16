
public class MyPoint {
    private int x, y;
    
    public MyPoint() {
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance() {
        
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double distance(MyPoint another) {
       return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2)); 
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY() {
        int[] XY = new int[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
