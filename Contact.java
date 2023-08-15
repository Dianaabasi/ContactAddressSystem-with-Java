
package group7.contactAddressSystem;

/**
 *
 * @author DIANAABASI EKPENYONG
 */
public class Contact {
    String firstName = "";
    String lastName = "";
    String email = "";
    String homeAddress = "";

    public Contact(String firstName, String lastName, String email, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.homeAddress = homeAddress;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getFormattedInfo() {
        return "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "Email: " + email + "\n"
                + "Home Address: " + homeAddress;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}