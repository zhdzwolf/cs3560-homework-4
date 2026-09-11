package inheritance_files;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }
}
