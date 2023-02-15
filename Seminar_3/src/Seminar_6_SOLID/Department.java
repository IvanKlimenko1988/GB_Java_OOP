package Seminar_6_SOLID;

import java.util.ArrayList;
import java.util.Scanner;


public class Department implements UpdateDepint {
    String deptName;
    ArrayList<Persona> personaInDept = new ArrayList<>();
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    @Override
    public String UpdateDepint() {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите перейти в другой отдел?:");
        System.out.println("0 - НЕТ\n1 - ДА");
        int answer = in.nextInt();

        if (answer == 0) {
            System.out.println("Молодец, стабильность - признак мастерста");
        }
        if (answer == 1) {
            System.out.println("В какой отдел желаете перейти?");
            System.out.println("IT\nLogistics\nFinance");
        }
        String answer1 = in.next();
        return answer1;
    }
    @Override
    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }

}
