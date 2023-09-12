
package animals_;

/**
 *
 * @author John Faber Navia
 */
public class Dog extends Animal{
     private String raza;

    public Dog(String nombre,String tipo_alimentacion,int edad,String raza){
        super(nombre,tipo_alimentacion,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void show(){
        System.out.println(getName() + "-"+getTypeFeeding()+"-"+getAge()+"-"+getRaza());
    }

    @Override
    public void feed() {
        System.out.println("Me alimento de corquetas");
    }
}

