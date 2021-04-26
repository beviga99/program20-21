package Práctica;

import java.util.Scanner;

public class DíasMes {

   
    public static void main(String[] args) {
        int Días;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Introduce el número de días (28, 31 o 30): ");
        Días=in.nextInt();
        
        System.out.print("Estos son los meses con " + Días +" días: ");
        System.out.println();
        Meses(Días);
        System.out.println();
    }
    
    public static void Meses(int Días) {
        switch(Días){
            case 28:
                System.out.print("Febrero");
                break;
            case 30:
                System.out.print("Abril, Junio, Septiembre, Noviembre");
                break;
            case 31:
                System.out.print("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre"); 
        }
    }
}
