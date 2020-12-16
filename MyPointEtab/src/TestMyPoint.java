import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class TestMyPoint {
    public static void main(String[] args) {
        
        int num1, num2, bol;
        String res;
        
        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i <10; i++){
            points[i] = new MyPoint(i+1, i+1);
        }
        
        MyPoint p0 = new MyPoint(0,0);
        MyPoint p1 = new MyPoint(2,1);
        MyPoint p2 = new MyPoint(4,0);
        MyPoint p3 = new MyPoint();
        
        Scanner in = new Scanner(System.in);
        
        ArrayList<MyPoint> puntuak = new ArrayList<MyPoint>();
        
        bol = 0;
        
        while(bol == 0){
        
            System.out.print("Sartu x: ");
            num1 = in.nextInt();
        
            System.out.print("Sartu y: ");
            num2 = in.nextInt();
            p3 = new MyPoint(num1, num2);
            puntuak.add(p3);
            
            System.out.print("Jarraitu nahi duzu?(y/n)");
            res = in.next();
            
            if(res.equals("y")){
                bol = 0;
            } else {
                bol = 1;
            }
        }
        System.out.println(puntuak);
    }
}
