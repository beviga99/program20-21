/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutables;

import model.Entrenador;
import model.Futbolista;
import model.IntegranteSelecion;
import model.EuskalSelekzioa;

import java.util.ArrayList;
import java.util.Scanner;
import static javax.swing.text.html.HTML.Tag.P;
import static model.EuskalSelekzioa.azkenId;
import static model.EuskalSelekzioa.selekzioOsoaSortu;
import static model.EuskalSelekzioa.selekzioa;
import model.Masajista;

/** Programa honetan Euskal Selekzioaren datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  Programa hau selekzioko partaideen datuak kargatzen hasiko da. 
 *  Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina 
 *  oraindik hori ez dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * 
 *  Gero, horrelako menu bat agertuko zaigu:
 * 
 *  **********************************************************
 *  *    EUSKAL SELEKZIOA
 *  *  ----------------------------------
 *  *  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)
 *  *  2. Partaideen datuak ikusi taldekatuta
 *  *  3. Futbolariak alfabetikoki inprimatu
 *  *  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)
 *  *  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)
 *  *  z. Irten
 * 
 *  *  Aukeratu zenbaki bat:
 * 
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSelecion> selekzioa = new ArrayList<>(); 
    
        
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String aukera;
        EuskalSelekzioa.selekzioOsoaSortu();
        EuskalSelekzioaMenua.selekzioa = EuskalSelekzioa.selekzioa;
        
        System.out.println("  EUSKAL SELEKZIOA");
        System.out.println("----------------------------------");
        System.out.println("1. Partaideen datuak ikusi");
        System.out.println("2. Partaideen datuak ikusi taldekatuta");
        System.out.println("3. Futbolariak alfabetikoki inprimatu");
        System.out.println("4. Aldaketa");
        System.out.println("5. Bilatu abizenetik");
        System.out.println("z. Irten");
        
        System.out.println("Aukeratu zenbaki bat:");
        aukera = in.next();
        
        switch(aukera) {
            case "1":
                
                for (int i = 0; i < selekzioa.size(); i++) {
                    System.out.println(selekzioa.get(i).toString());
                }
                
            case "2":
                
                System.out.println("Futbolistak: " + Futbolista.futcop);
                
                for (int i = 0; i < selekzioa.size(); i++) {
                    if(selekzioa.get(i).getClass() == Futbolista.class) {
                        System.out.println(selekzioa.get(i).toString());
                    }
                }
                
                System.out.println("Entrenadores: " + Entrenador.encop);
                
                for (int i = 0; i < selekzioa.size(); i++) {
                    if(selekzioa.get(i).getClass() == Entrenador.class) {
                        System.out.println(selekzioa.get(i).toString());
                    }
                }
                
                System.out.println("Masajistas: " + Masajista.macop);
                
                for (int i = 0; i < selekzioa.size(); i++) {
                    if(selekzioa.get(i).getClass() == Masajista.class) {
                        System.out.println(selekzioa.get(i).toString());
                    }
                }
                
                System.out.println("Beste partaidea: ");
                
                for (int i = 0; i < selekzioa.size(); i++) {
                    if(selekzioa.get(i).getClass() != Futbolista.class && selekzioa.get(i).getClass() != Entrenador.class && selekzioa.get(i).getClass() != Masajista.class) {
                        System.out.println(selekzioa.get(i).toString());
                    }
                }

        }
        
        
    }   

}
