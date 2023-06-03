package domain;

public class Persona {
    private String nombre; // CREO UN ATRIBUTO PRIVADO LLAMADO NOMBRE
    
//CONSTRUCTOR PARA INICIALIZAR EL ATRIBUTO DE NOMBRE
    public Persona(String nombre) {
        this.nombre = nombre;
    }
// METODOS GET Y SET
    public String getNombre(){ 
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+ super.toString();
    }

}
