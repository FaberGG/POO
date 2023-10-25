package principal;

import formas.*;

/**
 *
 * @author IngSis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Triangulo miTrianglo = new Triangulo(3, 3, 3, 3);
        Paralelogramo miParalelogramo = new Paralelogramo(5, 2, 3);

        // Calcular y mostrar áreas y perímetros
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("\n Área del triangulo: " + miTrianglo.calcularArea());
        System.out.println("Perímetro del triangulo: " + miTrianglo.calcularPerimetro());

        System.out.println("\n Área del paralelogramo: " + miParalelogramo.calcularArea());
        System.out.println("Perímetro del paralelogramo: " + miParalelogramo.calcularPerimetro());

        System.out.println("\n Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
    }
}
