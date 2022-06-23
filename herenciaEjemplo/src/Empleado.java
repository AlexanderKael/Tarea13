public class Empleado extends Persona
{
    protected int salario;
    protected int comision;

    public Empleado(String nombre, String apellido, int edad, int salario, int comision) {
        super(nombre, apellido, edad);
        this.salario = salario;
        this.comision = comision;
    }
   @Override
    public void mostrarDatos(){
        System.out.println("\nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nsalario: "+salario+"\ncomision: "+comision);
    }

}
