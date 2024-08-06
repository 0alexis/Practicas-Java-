import java.util.Scanner;


public class Patient {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthDate;
    private double weight;              //peso
    private double height;             //altura
    private String blood;             //sangre

     Patient(String name, String email, String address, String phoneNumber, String birthDate, double weight, double height, String blood){
//metodo constructor para usarse
        // System.out.println("The name of the patient is: " + name);
// patient es paciente
         this.id = id;
         this.name = name;
         this.email = email;
         this.address = address;
         this.phoneNumber = phoneNumber;
         this.birthDate = birthDate;
         this.weight = weight;
         this.height = height;
         this.blood = blood;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
         if(phoneNumber.length() > 10 ){ //sirve para que al momento de colocar lo numero sean 10
             System.out.println("debe se asignar 10 numeros");
         } else if (phoneNumber.length() == 10 ){
             this.phoneNumber = phoneNumber;
         }

    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
}
