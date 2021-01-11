package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vilarchao.benat
 */
public class Futbolista extends IntegranteSelecion{

    private int dorsal;
    private String demarcacion;
    public static int futcop;
    
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        futcop++;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void entrenando() {
        System.out.println(super.getNombre() + " " + super.getApellidos() + " esta entrenando.");
    }
    
    public void jugarPartido() {
        System.out.println(super.getNombre() + " " + super.getApellidos() + " esta jugando el partido.");
    }

    public String toString() {
        return "Futbolista: {id: " + super.getId() + ", nombre: " + super.getNombre() + ", apellido: " + super.getApellidos() + ", edad: " + super.getEdad() + ", dorsal: " + getDorsal() + ", demarcacion: " + getDemarcacion() + "}";
    }
}
