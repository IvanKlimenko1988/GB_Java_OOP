public class view {
    public static void treeView(Persona root, int num) {
        String line = "_".repeat(num);
        System.out.println(line + root.getName());
        for (Persona a : root.getListName()) {
            treeView(a, num + 1);
        }
    }

    public static void bookView(Persona root) {
        System.out.println("Имя библиотеки " + root.PersLibr.LibraryName);
        for (LibraryBooks a : root.PersLibr.listBook) {
            System.out.println(a.bAuthor + " " + a.bName);
        }
    }

    public static void petsView(Persona root) {
        System.out.println("Животные " + root.PersPet.petsName);
        for (ListPets a : root.PersPet.listNamePets) {
            System.out.println(a.petsName + " " + a.petsSex + " " + a.petsAge);
        }
    }
}
