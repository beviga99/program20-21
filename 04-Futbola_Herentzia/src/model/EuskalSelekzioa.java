package model;

import java.util.ArrayList;
import model.Futbolista;

public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    ArrayList<IntegranteSelecion> selekzioa = new ArrayList<IntegranteSelecion>();

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
        
    
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){

        return false;
    }
}