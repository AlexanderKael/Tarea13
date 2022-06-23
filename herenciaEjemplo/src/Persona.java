public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    protected Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected int getEdad() {
        return edad;
    }

    public abstract void mostrarDatos();
}
