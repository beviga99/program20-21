
public class MyTriangle {
    private MyPoint v1, v2, v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        return "Triangle[" + this.v1.getX() + ", " + this.v1.getY() + "], [" + this.v2.getX() + ", " + this.v2.getY() + "], [" + this.v3.getX() + ", " + this.v3.getY() + "]";
    }
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    public String getType() {
        if(v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1) && v3.distance(v1) == v1.distance(v2)) {
            return "Equilateral Triangle.";
        } else if(v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) && v3.distance(v1) == v1.distance(v2)) {
            return "Isosceles Triangle.";
        } else {
            return "Scalene Triangle";
        }
    }
    public void setV1(int x, int y) {
        v1 = new MyPoint(x, y);
    }
    public void setV1X(int x) {
        this.v1.setX(x);
    }
    public void setV1Y(int y) {
        this.v1.setY(y);
    }
    public void setV2(int x, int y) {
        v2 = new MyPoint(x, y);
    }
    public void setV2X(int x) {
        this.v2.setX(x);
    }
    public void setV2Y(int y) {
        this.v2.setY(y);
    }
    public void setV3(int x, int y) {
        v3 = new MyPoint(x, y);
    }
    public void setV3X(int x) {
        this.v3.setX(x);
    }
    public void setV3Y(int y) {
        this.v3.setY(y);
    }
    public MyPoint getV1() {
        return this.v1;
    }
    public int getV1X() {
        return this.v1.getX();
    }
    public int getV1Y() {
        return this.v1.getY();
    }
    public MyPoint getV2() {
        return this.v2;
    }
    public int getV2X() {
        return this.v2.getX();
    }
    public int getV2Y() {
        return this.v2.getY();
    }
    public MyPoint getV3() {
        return this.v1;
    }
    public int getV3X() {
        return this.v3.getX();
    }
    public int getV3Y() {
        return this.v3.getY();
    }
}
