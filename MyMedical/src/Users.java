public class Users {
    private int id;
    private String name, email, address;


    public Users(String name, String email) {

        this.name = name;
        this.email = email;
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

    private String phoneNumber;
    private String birthDate;

    @Override
    public String toString() {
        return "Users: "+ name + ", Email"+ email + "Age: "+ birthDate+ "\n Address: "+ address + "Phone: "+phoneNumber;

    }
}
