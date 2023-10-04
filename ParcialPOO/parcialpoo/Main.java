package parcialpoo;

import empleados.Empleado;
import empleados.EmpleadoAsalariado;
import empleados.EmpleadoPorHoras;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Empleado empleado = new Empleado();
        Scanner input = new Scanner(System.in);

        LinkedList<Empleado> objetos = new LinkedList<Empleado>();
        System.out.println(" Para trabajadores con salario fijo");
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el nombre del trabajador " + (i + 1));
            String nombre = input.nextLine();
            System.out.println("ingrese el salario del trabajador " + (i + 1));
            Double salario = input.nextDouble();

            if (i < 5) {
                System.out.println("ingrese el las deducciones del trabajador " + (i + 1));
                Double deducciones = input.nextDouble();
                EmpleadoAsalariado empleadoA = new EmpleadoAsalariado(nombre, salario, deducciones);
                objetos.add(i, empleadoA);

            } else {
                System.out.println("ingrese el las horas trabajadas del trabajador " + (i + 1));
                int horasTrabajadas = input.nextInt();
                System.out.println("ingrese el valor por hora del trabajador " + (i + 1));
                Double tarifaHora = input.nextDouble();
                EmpleadoPorHoras empleadoH = new EmpleadoPorHoras(nombre, salario, horasTrabajadas, tarifaHora);
                objetos.add(i, empleadoH);

            }
        }

        //obtener empleados por hora
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                System.out.println("Los empleados por hora son:");
                System.out.println("Empleado " + (i + 1));
                System.out.println(" Nombre:" + objetos.get(i).getNombre());
                System.out.println(" Salario:" + objetos.get(i).getSalario());
            } else {
                System.out.println("Los empleados por salario fijo son son:");
                System.out.println("Empleado " + (i + 1));
                System.out.println(" Nombre:" + objetos.get(i).getNombre());
                System.out.println(" Salario:" + objetos.get(i).getSalario());
            }
        }
        //Modificar el nombre o salario de un empleado
        System.out.println("De cual trabajador desea modificar el nombre o salario? ");
        System.out.print("  Ingese el numero de trabajador: ");
        int num = input.nextInt();

        System.out.println("Que desea modificar NOMBRE[1] O SALARIO[2]");
        int opc = input.nextInt();
        if (opc == 1) {
            System.out.print(" \nIngrese el nombre nuevo del trabajador: ");
            String nombre = input.nextLine();
            objetos.get(num).setNombre(nombre);
        } else if (opc == 2) {
            System.out.print(" \nIngrese el salario nuevo del trabajador: ");
            double salario = input.nextDouble();
            objetos.get(num).setSalario(salario);
        }

        // Obtener empleados por horas
        for (int i = 0; i < 5; i++) {
            System.out.println("Los empleados por hora son:");
            System.out.println("Empleado " + (i + 1));
            System.out.println(" Nombre:" + objetos.get(i).getNombre());
            System.out.println(" Salario:" + objetos.get(i).getSalario());
        }

        // obtener un empleado especifico
        System.out.println("De cual trabajador desea obtener su informacion? ");
        System.out.print("  Ingese el numero de trabajador: ");
        int opcion = input.nextInt();

        System.out.println("\nLa informacion del trabajador " + num + " es:");
        System.out.println("Nombre: " + objetos.get(num).getNombre());
        System.out.println("Salario " + objetos.get(num).getSalario());

    }

}
