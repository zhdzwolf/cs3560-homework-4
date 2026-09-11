package inheritance_files;

public class Employee {
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}