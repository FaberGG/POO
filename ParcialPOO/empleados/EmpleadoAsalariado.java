package empleados;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class EmpleadoAsalariado extends Empleado {

    private double deducciones;

    public EmpleadoAsalariado(String nombre, double salario, double deducciones) {
        super(nombre, salario);
        this.deducciones = deducciones;
    }

    @Override
    public double calcularSalario() {
        return salario - deducciones;
    }
}
