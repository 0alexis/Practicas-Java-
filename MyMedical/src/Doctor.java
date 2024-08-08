import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Doctor extends Users{
   //atributos propios de doctor
    private String speciality;



    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    Doctor(String name, String email, String speciality){
  super(name, email);

       // System.out.println("El nombre del doctor asignado es: " + name);

      this.speciality = speciality;

    }

//comportamientos

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
    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+ speciality;

    }
}
