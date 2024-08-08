import java.util.Scanner;


public class Patient extends Users{
   //atributos propios de paciente

    private double weight;              //peso
    private double height;             //altura
    private String blood;             //sangre


    //metodo constructor para usarse
     Patient(String name, String email, String address, String phoneNumber, String birthDate, double weight, double height, String blood){
         super(name, email);

        // System.out.println("The name of the patient is: " + name);
// patient es paciente

         this.weight = weight;
         this.height = height;
         this.blood = blood;
     }


    public String getWeight() {
        return weight +" Mts.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Kg";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    @Override
    public String toString() {
        return super.toString() + "\nWeigth: "+ weight +" Heigth: "+height + " Blood: "+ blood;

    }
}
