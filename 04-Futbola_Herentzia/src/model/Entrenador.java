package model;



public class Entrenador extends IntegranteSelecion{
    
    private String IdFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String IdFederacion) {
        super(id, nombre, apellidos, edad);
    }

    public String getIdFederacion() {
        return IdFederacion;
    }

    public void setIdFederacion(String IdFederacion) {
        this.IdFederacion = IdFederacion;
    }
    
    public void dirigirEntrenamiento() {
        System.out.println("Esta dirigiendo el entrenamiento.");
    }
    
    public void dirigirPartido() {
        System.out.println("Esta dirigiendo el partido.");
    }

    public String toString() {
        return "Entrenador: {id: " + super.getId() + ", nombre: " + super.getNombre() + ", apellido: " + super.getApillidos() + ", edad: " + super.getEdad() + ", Numero de federacion: " + getIdFederacion() + "}";
    }
}
