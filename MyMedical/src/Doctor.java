import java.util.Scanner;


public class Doctor {
    static int id = 0;
    String name;
    String speciality;

Doctor(){
    System.out.println(" ");
id++;
}
    public void ShowName(){
        System.out.println("Nombre Doctor " + name);

    }
    public void ShowId(){
    System.out.println("ID doctor:" + id);
    }

    public void ShowSpeciality(){
    System.out.println("Su especialidad es: " + speciality);
    }
}
