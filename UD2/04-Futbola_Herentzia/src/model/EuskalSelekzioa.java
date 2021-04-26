package model;

import java.util.ArrayList;
import java.util.Scanner;
import model.Futbolista;

public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSelecion> selekzioa = new ArrayList<IntegranteSelecion>();

    public static void main(String[] args) {
        
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(){
        Futbolista f1 = new Futbolista(azkenId++, "Asier", "Villalibre", 23, 11, "DEL");
        f1.toString();
        f1.entrenando();
    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(){
        Entrenador e1 = new Entrenador(azkenId++, "Javier", "Clemente", 71, "AAAA2");
        Entrenador e2 = new Entrenador(azkenId++, "Iñaki", "Sertxiberrieta", 56, "BABA4");
        Entrenador e3 = new Entrenador(azkenId++, "Ander", "Etxeburu", 42, "SAET7");
        e1.toString();
        e2.toString();
        e3.toString();
        e1.concentrarse();
        e2.concentrarse();
        e3.concentrarse();
        e1.viajar();
        e2.viajar();
        e3.viajar();
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public static void selekzioOsoaSortu(){
        /*Scanner in = new Scanner(System.in);

        String name;
        String surname;
        int age;
        int i = 0;
        String continu;
        while(i == 0){
            System.out.println("Enter the name: ");
            name = in.next();
        
            System.out.println("Enter the surname: ");
            surname = in.next();
        
            System.out.println("Enter the age: ");
            age = in.nextInt();
        
            IntegranteSelecion p1 = new IntegranteSelecion(azkenId++, name, surname, age);
        
            selekzioa.add(p1);
            
            System.out.println("Do you want to continue? (y/n)");
            continu = in.next();
            while(!continu.equals("y") && !continu.equals("n")) {
                System.out.println("Wrong value, try again. (y/n)");
            }
            if(continu.equals("y")) {
                i = 0;
            } else {
                i = 1;
            }
        }*/
        selekzioa.add(new Futbolista(azkenId++, "Aitor", "Fernández", 29, 1, "POR"));
        selekzioa.add(new Futbolista(azkenId++, "Unai", "Bustinza", 28, 2, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Mikel", "Balenziaga", 32, 3, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Asier", "Illarramendi", 30, 4, "MED"));
        selekzioa.add(new Futbolista(azkenId++, "Iñigo", "Martínez", 29, 5, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Mikel", "San José", 31, 6, "MED"));
        selekzioa.add(new Futbolista(azkenId++, "Gaizka", "Larrazabal", 23, 7, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Manu", "García", 34, 8, "MED"));
        selekzioa.add(new Futbolista(azkenId++, "Aritz", "Aduriz", 39, 9, "DEL"));
        selekzioa.add(new Futbolista(azkenId++, "Javier", "Eraso", 30, 10, "MED"));
        selekzioa.add(new Futbolista(azkenId++, "Asier", "Villalibre", 23, 11, "DEL"));
        selekzioa.add(new Futbolista(azkenId++, "Aihen", "Muñoz", 23, 12, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Iago", "Herrerín", 32, 13, "POR"));
        selekzioa.add(new Futbolista(azkenId++, "Aritz", "Elustondo", 26, 14, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Jesús", "Areso", 21, 15, "DEF"));
        selekzioa.add(new Futbolista(azkenId++, "Iñigo", "Vicente", 23, 16, "DEL"));
        selekzioa.add(new Futbolista(azkenId++, "Daniel", "VIvian", 21, 17, "DEF"));
        selekzioa.add(new Entrenador(azkenId++, "Javier", "Clemente", 71, "AAADA2"));
        selekzioa.add(new Entrenador(azkenId++, "Joseba", "Nuñez", 58, "AfADA2"));
        selekzioa.add(new Entrenador(azkenId++, "Markel", "Lautadahandi", 60, "AfdDA2"));
        selekzioa.add(new Masajista(azkenId++, "Iñaki", "Sertxiberrieta", 50, "Masajista", 10));
        selekzioa.add(new IntegranteSelecion(azkenId++, "Ander", "Etxeburu", 45));
        
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        if (id <= selekzioa.size()) {
            selekzioa.remove(id);
            return true;
        } else {
            return false;        
        }

    }
}