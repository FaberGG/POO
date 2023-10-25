package formas;

/**
 *
 * @author IngSis
 */
public class Paralelogramo implements Forma{
    public double base, alto, ladob;

    public Paralelogramo(double base, double alto, double ladob) {
        this.base = base;
        this.alto = alto;
        this.ladob = ladob;
    }
    
    @Override
    public double calcularArea() {
        return base * alto;
    }

    
    @Override
    public double calcularPerimetro() {
        return 2 * (ladob + base);
    }
}
