import java.util.ArrayList;
class ListPets {
    public String petsName;
    public String petsSex;
    public int petsAge;
}
public class Pets extends Animal {
    public Pets(String name, String sex, int age) {
        setName(name);
        setSex(sex);
        setAge(age);
    }
    public String petsName;
    public Pets(String name) {
        this.petsName = name;
    }

    public void addPets(String petsName, String petsSex, int petsAge) {
        ListPets lp = new ListPets();
        setName(petsName);
        setSex(petsSex);
        setAge(petsAge);
        lp.petsName = getName();
        lp.petsSex = getSex();
        lp.petsAge = getAge();
        listNamePets.add(lp);

    }

    ArrayList<ListPets> listNamePets = new ArrayList<>();

//    public void addPetsName(Pets pet) {
//        listNamePets.add(pet);
//    }
//
//    public ArrayList<Pets> getListNamePets() {
//        return listNamePets;
//    }

    public void sayPet() {
        String name = getName();
        System.out.println("Меня зовут " + name);
    }

}
