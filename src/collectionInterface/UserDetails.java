package collectionInterface;

public class UserDetails {
    String firstname;
    String lastName;
    int age;
    public UserDetails(String Firstname,String Lastname,int age){
        this.firstname =firstname;
        this.lastName = lastName;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastName(){
        return lastName;
    }

}
