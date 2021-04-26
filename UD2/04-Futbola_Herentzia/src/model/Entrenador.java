package model;



public class Entrenador extends IntegranteSelecion{
    
    private String IdFederacion;
    public static int encop;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String IdFederacion) {
        super(id, nombre, apellidos, edad);
        encop++;
    }

    public String getIdFederacion() {
        return IdFederacion;
    }

    public void setIdFederacion(String IdFederacion) {
        this.IdFederacion = IdFederacion;
    }
    
    public void dirigirEntrenamiento() {
        System.out.println(super.getNombre() + " " + super.getApellidos() + " esta dirigiendo el entrenamiento.");
    }
    
    public void dirigirPartido() {
        System.out.println(super.getNombre() + " " + super.getApellidos() + " esta dirigiendo el partido.");
    }

    public String toString() {
        return "Entrenador: {id: " + super.getId() + ", nombre: " + super.getNombre() + ", apellido: " + super.getApellidos() + ", edad: " + super.getEdad() + ", Numero de federacion: " + getIdFederacion() + "}";
    }
}
