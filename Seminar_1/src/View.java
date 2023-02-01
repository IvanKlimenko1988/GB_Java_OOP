public class View {
    public static void viewTree(Persona name, int count) {
        String line = "_".repeat(count);
        System.out.println(line + name.getPersona_name());
        for (Persona p : name.getListPersons()) {
            viewTree(p, count + 1);
        }


    }
}
