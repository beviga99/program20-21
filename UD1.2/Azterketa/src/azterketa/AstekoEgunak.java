package azterketa;

import java.util.Scanner;

public class AstekoEgunak {

    public static void main(String[] args) {
       int Eguna;
       String[] EU={"Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larunbata", "Igandea"};
       String[] ES={"Lunes", "Martes", "Miércoles","Jueves", "Viernes", "Sábado", "Domingo"};
       String[] EN={"Monday", "Twesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       String Hezkuntza;
       Scanner in=new Scanner(System.in);
       
       System.out.print("Aukeratu eguna (1-7):");
       Eguna=in.nextInt();
       if (Eguna>7){
           System.out.print("Balio okerrak sartu dituzu.");
       }
       System.out.print("Aukeratu hizkuntza (EU,ES,EN):");
       Hezkuntza=in.next();
       
       switch(Hezkuntza) {
           case "EU":
               System.out.print(EU[Eguna-1]);
               break;
           case "ES":
               System.out.print(ES[Eguna-1]);
               break;
           case "EN":
               System.out.print(EN[Eguna-1]);
               break;
           default:
               System.out.print("Balio okerrak sartu dituzu.");
               break;
       }
       System.out.println();
    } 
}
