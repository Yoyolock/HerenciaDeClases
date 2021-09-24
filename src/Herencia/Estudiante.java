package Herencia;

public class Estudiante extends Persona{
    private int IDStudent;
    private float score;

    public Estudiante(String name, String lastname, int age, int IDStudent, float score){
        super(name, lastname, age);
        this.IDStudent = IDStudent;
        this.score = score;
    }
    public void showDates(){
        System.out.println("Nombre: " + getName());
        System.out.println("Apellido " + getLastName());
        System.out.println("Edad " + getAge());
        System.out.println("ID Estudiante " + IDStudent);
        System.out.println("Notal final " + score);
    }
}
