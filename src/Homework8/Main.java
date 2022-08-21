package Homework8;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Hirurg hirurg = new Hirurg();
        Terapevt terapevt = new Terapevt();
        Dentist dentist = new Dentist();
        patient.name = "Valera";
        patient.age = 23;
        patient.plan = 1;
        if (patient.plan == 1) {
            System.out.println("Doctor: hirurg");
        } else if (patient.plan == 2) {
            System.out.println("Doctor: dentist");
        } else if ((patient.plan != 1) && (patient.plan != 2)) {
            System.out.println("Doctor: terapevt");
        }
    }
}
