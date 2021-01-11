package model;


public class Masajista extends IntegranteSelecion{
    
    private String titulacion;
    private int aniosExperiencia;
    public static int macop;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
        macop++;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
    public void darMasage() {
        System.out.println(super.getNombre() + " " + super.getApellidos() + " esta dando un masage.");
    }
    
}
