import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Persona extends Human {
    public Library PersLibr;
    public Pets PersPet;

    public Persona(String name, String sex, int age, String persLibr, String persPet) {
        setSex(sex);
        setName(name);
        setAge(age);
        this.PersLibr = new Library(persLibr);
        this.PersPet = new Pets(persPet);

    }

    ArrayList<Persona> listName = new ArrayList<>();

    public void addName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void voice() {
        String name = getName();
        System.out.println("Меня зовут " + name);
    }

    public void pBook() {

    }
}