package Seminar_6_SOLID;

import java.util.Scanner;


public class Persona implements AddGroup, AddPersonaToDepartment {
    String personaFIO;
    String personaSex;
    int personaAge;

    public Persona(String personaFIO, String personaSex, int personaAge) {
        this.personaFIO = personaFIO;
        this.personaSex = personaSex;
        this.personaAge = personaAge;
    }

    public String getPersonaFIO() {
        return personaFIO;
    }

    public String getPersonaSex() {
        return personaSex;
    }

    public int getPersonaAge() {
        return personaAge;
    }

    @Override
    public boolean checkAddGroup(Group group) {
        System.out.println("Добавить в группу " + group.deptName + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 - НЕТ\n1 - ДА");
        int choice = in.nextInt();
        return choice != 0;
    }
    @Override
    public void addPersonaToDepartment(Persona persona, Group group) {
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("Олень отказался!");
        }
    }

    public void viewInfoPerson() {
        System.out.println("ФИО:" + getPersonaFIO()
                + " " + "Пол:" + getPersonaSex()
                + " " + "Возраст:" + getPersonaAge());
    }

}
