package figuras;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class Circulo extends FormaGeometrica{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}