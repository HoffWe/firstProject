package Models;

public class Passenger {
    private int passengerId;
    private String name;
    private String surname;
    private String email;
    private int phoneNumber;

    //konstruktor-----------------------------------------------------------------------------------
    public Passenger(int idPassenger, String name, String surname, String email, int phoneNumber){

        this.passengerId = idPassenger;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber= phoneNumber;

    }

//gettery-----------------------------------------------------------------------------------

    public int getId(){
        return passengerId;
    }

    public String  getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

//settery-----------------------------------------------------------------------------------

    public void setId(int id){
        this.passengerId = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //PASSENGER TEST GIT
}
