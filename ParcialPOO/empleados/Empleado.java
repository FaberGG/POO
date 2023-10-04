package empleados;

/**
 *
 * @author John Faber Navia Narvaez
 */
public abstract class Empleado {
    private String nombre;
    protected double salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract double calcularSalario();
    
}
