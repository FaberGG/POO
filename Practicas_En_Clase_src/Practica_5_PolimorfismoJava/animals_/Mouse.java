package animals_;

/**
 *
 * @author John Faber Navia
 */
public class Mouse extends Animal{
         private String especie;

    public Mouse(String nombre,String tipo_alimentacion,int edad,String especie){
        super(nombre,tipo_alimentacion,edad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void show(){
        System.out.println(getName() + "-"+getTypeFeeding()+"-"+getAge()+"-"+getEspecie());
    }

    @Override
    public void feed() {
        System.out.println("Me alimento de queso");
    }
}
