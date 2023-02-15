package Seminar_6_SOLID;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("ФИО работника: ");
        FIO = in.nextLine();
        System.out.println("Пол работника: ");
        Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        Age = in.nextInt();
        Persona p = new Persona(FIO, Sex, Age);
        p.viewInfoPerson();
        Group depAcc = new Group("Accounting");
        View.depView(depAcc);
        Group depAcc1 = new Group(depAcc.UpdateDepint());
        View.depView(depAcc1);
    }





}
