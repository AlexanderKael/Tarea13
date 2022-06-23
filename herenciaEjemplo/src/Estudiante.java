public class Estudiante extends Persona

{
    protected int codigoEstudiante;
    protected int notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, int notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+
                "\nCodigo Estudiante: "+codigoEstudiante+"\nNota Final: "+notaFinal);
    }
}
