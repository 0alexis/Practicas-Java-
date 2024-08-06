import java.util.Scanner;


public class Doctor {
    static int id = 0;
    String name;
    String email;
    String speciality;

Doctor(){
    System.out.println(" ");
        }
    Doctor(String name, String email, String speciality){

        System.out.println("El nombre del doctor asignado es: " + name);
id++;
      this.name = name;
      this.email = email;
      this.speciality = speciality;

    }

//comportamientos
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
