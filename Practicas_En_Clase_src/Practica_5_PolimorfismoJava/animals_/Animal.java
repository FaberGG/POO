package animals_;

/**
 *
 * @author John Faber Navia
 */
public abstract class Animal {
 private String name,typeFeeding;
    private int age;

    public Animal(String nombre,String tipo_alimentacion,int edad){
        this.name = nombre;
        this.typeFeeding = tipo_alimentacion;
        this.age = edad;
    }

    /**
     * @Tittle METODO ABSTRACTO
     * @Content Este metodo se crea cuando declaramos abstract la funcion
     */
    public abstract void feed();

    public void move(){
        System.out.println("El animal se esta moviendo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeFeeding() {
        return typeFeeding;
    }

    public void setTypeFeeding(String typeFeeding) {
        this.typeFeeding = typeFeeding;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
