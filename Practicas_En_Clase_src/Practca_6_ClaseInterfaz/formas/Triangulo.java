
package formas;

/**
 *
 * @author IngSis
 */
public class Triangulo implements Forma{
    public double base, altura, ladoa, ladob;

    public Triangulo(double base, double altura, double ladoa, double ladob) {
        this.base = base;
        this.altura = altura;
        this.ladoa = ladoa;
        this.ladob = ladob;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base + ladoa + ladob;
    }
}