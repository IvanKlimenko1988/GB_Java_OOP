import java.util.ArrayList;

public class Pets extends Animal {
    public Pets(String name, String sex, int age) {
        setName(name);
        setSex(sex);
        setAge(age);
    }

    ArrayList<Pets> listNamePets = new ArrayList<>();

    public void addPetsName(Pets pet) {
        listNamePets.add(pet);
    }

    public ArrayList<Pets> getListNamePets() {
        return listNamePets;
    }

    public void sayPet() {
        String name = getName();
        System.out.println("Меня зовут " + name);
    }

}
