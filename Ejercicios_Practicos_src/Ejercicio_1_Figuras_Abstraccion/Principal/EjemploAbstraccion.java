
package Principal;

import figuras.Circulo;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class EjemploAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un objeto circulo
        Circulo circulo = new Circulo(5.0);
        
        //calcular y mostrar el area del circulo
        double area = circulo.calcularArea();
        System.out.println("Area del circulo: " + area);
    }
    
}
