package interface_files;

public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = Math.abs(hourlyRate);
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = Math.abs(hoursWorked);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void print() {
        System.out.println("Payee Name: " + getPayeeName());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Calculated Payment: $" +  calculatePayment());
    }

    @Override
    public double calculatePayment() {
        if (hoursWorked > 40) {
            return (hourlyRate * 40) + (hourlyRate * (hoursWorked - 40) * 1.5);
        }
        else  {
            return hourlyRate * hoursWorked;
        }
    }
    @Override
    public String getPayeeName() {
        return getFirstName() + " " + getLastName();
    }
}
