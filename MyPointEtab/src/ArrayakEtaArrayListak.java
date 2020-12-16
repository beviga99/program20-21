
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayakEtaArrayListak {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint();
        MyPoint p3 = new MyPoint();
        
        Scanner in = new Scanner(System.in);
        
        int num1, num2, bol;
        String res;
        
        MyTriangle[] hirukia = new MyTriangle[3];
        for(int i = 0; i <3; i++){
            hirukia[i] = new MyTriangle(p1 = new MyPoint(i+5,i-3),p2 = new MyPoint(i,i), p3 = new MyPoint(i+10,i-4));
            System.out.println(hirukia[i].toString());
        }
        
        ArrayList<MyRectangle> karratua = new ArrayList<MyRectangle>();
        
        bol = 0;
        
        while(bol == 0){
        
            System.out.print("Sartu x: ");
            num1 = in.nextInt();
        
            System.out.print("Sartu y: ");
            num2 = in.nextInt();
            p1 = new MyPoint(num1, num2);
                        System.out.print("Sartu beste x: ");
            num1 = in.nextInt();
        
            System.out.print("Sartu beste y: ");
            num2 = in.nextInt();
            p2 = new MyPoint(num1, num2);
            karratua.add(new MyRectangle(p1,p2));
            
            System.out.print("Jarraitu nahi duzu?(y/n)");
            res = in.next();
            
            if(res.equals("y")){
                bol = 0;
            } else {
                bol = 1;
            }
        }
        System.out.println(karratua.toString());
    }
}
