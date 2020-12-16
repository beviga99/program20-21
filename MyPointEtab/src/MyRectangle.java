
public class MyRectangle {
    private MyPoint topLeft, buttomRight;
    
    public MyRectangle(MyPoint topLeft, MyPoint buttomRight) {
        this.topLeft = topLeft;
        this.buttomRight = buttomRight;
    }
    public double getAzalera() {
        return Math.abs((this.topLeft.getX() - this.buttomRight.getX()) + (this.topLeft.getY() - this.buttomRight.getY()));
    }
    public double getPerimeter() {
        return Math.abs(2 * ((this.topLeft.getX() - this.buttomRight.getX()) + (this.topLeft.getY() - this.buttomRight.getY())));
    }
    public String toString() {
        return "Rectangle[" + this.topLeft.getX() + ", " + this.topLeft.getY() + "], [" + this.buttomRight.getX() + ", " + this.buttomRight.getY() + "]";
    }
    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }
    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }
    public void setTopLeftXY(int x, int y) {
        this.topLeft.setX(x);
        this.topLeft.setY(y);
    }
    public void setButtomRightX(int x) {
        this.buttomRight.setX(x);
    }
    public void setButtomRightY(int y) {
        this.buttomRight.setY(y);
    }
    public void setButtomRightXY(int x, int y) {
        this.buttomRight.setX(x);
        this.buttomRight.setY(y);
    }
    public MyPoint getTopLeft() {
        return this.topLeft;
    }
    public int getTopLeftX() {
        return this.topLeft.getX();
    }
    public int getTopLeftY() {
        return this.topLeft.getY();
    }
    public MyPoint getButtomRight() {
        return this.buttomRight;
    }
    public int getButtomRightX() {
        return this.buttomRight.getX();
    }
    public int getButtomRightY() {
        return this.buttomRight.getY();
    }
}
