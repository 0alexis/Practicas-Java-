import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Doctor {
    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

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

    //el arraylist creado e instanciado
    ArrayList<Availableappointment> availableappointments = new ArrayList<>();

    public void availableappointment (Date date, String time){
        availableappointments.add(new Doctor.Availableappointment(date,time));
    }
    public ArrayList<Availableappointment> getAvailableappointments(){
        return availableappointments;
    }


    public static class Availableappointment{
        private int id;
        private Date date;
        private String time;

        public Availableappointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        //citas disponibles

        public int getId_availableappointment() {
            return id;
        }

        public void setId_availableappointment(int id_availableappointment) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
