package empleados;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas, double tarifaHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora; 
    }
}
