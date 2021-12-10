public class ObjactOrientedProgram {
    private  String name = "Philip maulidi";
    private String Address = "#334, Matawale, zomba central ";
    private  String phoneNumber = "+2651511200";
    private  String emailAddress = "maulidiphilip@gmail.com";

    // create the default constructor

//    public ObjactOrientedProgram(){
//    }

    public ObjactOrientedProgram(){
        this.name = name;
        this.emailAddress = emailAddress;
    }

    // create accessors and mutators
    public String getName () {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getAdress () {
        return Address;
    }
    public void setAdress (String newAdress) {
        this.Address = newAdress;
    }
    public String getPhoneNumber () {
        return phoneNumber;
    }
    public void setPhoneNumber (String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
    public String getEmail () {
        return emailAddress;
    }
    public void setEmail (String newEmail) {
        this.emailAddress = newEmail;
    }
    // a method that will display the details of the class
    public String toString(){
        return  "\n the person full details are: " +
                "\n the person name is:  " + name +
                "\n Home address " + Address + "\n the persons phone number is: " + phoneNumber +
                "\n the persons email address is: " + emailAddress;
    }
}
