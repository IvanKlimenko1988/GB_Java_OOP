public class Main {
    public static void main(String[] args) {

        Persona father = new Persona("Иван");
        Persona mother = new Persona("Катя");
        Persona son = new Persona("Сегей");
        Persona daughter = new Persona("Лиза");
        Persona granddaughter = new Persona("Мила");

        mother.addPersonaToLists(son);
        mother.addPersonaToLists(daughter);

        father.addPersonaToLists(son);
        father.addPersonaToLists(daughter);

        daughter.addPersonaToLists(granddaughter);

        View.viewTree(father, 1);
        View.viewTree(mother, 1);

    }
}