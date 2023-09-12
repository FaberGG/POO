package mainpackage;

import animals_.Animal;
import animals_.Capybara;
import animals_.Horse;
import animals_.Dog;
import animals_.Cat;
import animals_.Mouse;

/**
 *
 * @author John Faber Navia
 */
public class Main {

    public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
        Animal perro = new Dog("Stich", "Carnivoro", 15, "Doberman");
        perro.feed();
        //-->Declaracion de otro objeto PERRO
        Dog perro1 = new Dog("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.feed();

        //-->Declaracion del objeto Gato
        Animal gato = new Cat("Pelusa", "Galletas", 15, "Siames");
        gato.feed();
        //-->Declaracion del objeto Caballo
        Animal caballo = new Horse("Spark", "Pasto", 25, "Fino");
        caballo.feed();
        //-->Declaracion del objeto Capybara
        Animal capybara = new Capybara("Fred", "Pasto", 5, "Hydrochoerus");
        capybara.feed();
        //-->Declaracion del objeto raton
        Animal raton = new Mouse("Jerry", "queso", 2, "Mus");
        raton.feed();
    }
}
