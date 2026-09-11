package inheritance_files;

public class HourlyEmployee extends Employee {
    private int wage;
    private int numHoursWorked;

    public void setWage(int wage) {
        this.wage = wage;
    }
    public void setNumHoursWorked(int numHoursWorked) {
        this.numHoursWorked = numHoursWorked;
    }

    public int getWage() {
        return wage;
    }
    public int getNumHoursWorked() {
        return numHoursWorked;
    }
}
