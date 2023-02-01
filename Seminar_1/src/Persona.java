import java.util.ArrayList;

public class Persona {
    private String persona_name;

    public Persona(String persona_name) {
        this.persona_name = persona_name;
    }

    ArrayList<Persona> listPersons = new ArrayList<>();

    public void addPersonaToLists(Persona name) {
        listPersons.add(name);
    }

    public String getPersona_name() {
        return persona_name;
    }

    public ArrayList<Persona> getListPersons() {
        return listPersons;
    }

}


