import inheritance_files.*;

public static void main(String[] args) {
    SalariedEmployee emp1 = new SalariedEmployee();
    emp1.setFirstName("Joe");
    emp1.setLastName("Jones");
    emp1.setSocialSecurityNumber(111111111);
    emp1.setWeeklySalary(2500);
    System.out.println(emp1.getFirstName() + " " + emp1.getLastName()
            + ", SSN: " + emp1.getSocialSecurityNumber() + ", Weekly salary: $" + emp1.getWeeklySalary());

    HourlyEmployee emp2 = new HourlyEmployee();
    emp2.setFirstName("Stephanie");
    emp2.setLastName("Smith");
    emp2.setSocialSecurityNumber(222222222);
    emp2.setWage(25);
    emp2.setNumHoursWorked(32);
    System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ", SSN: " + emp2.getSocialSecurityNumber()
            + ", Wage: $" + emp2.getWage() + ", Number of hours worked: " + emp2.getNumHoursWorked());

    HourlyEmployee emp3 = new HourlyEmployee();
    emp3.setFirstName("Mary");
    emp3.setLastName("Quinn");
    emp3.setSocialSecurityNumber(333333333);
    emp3.setWage(19);
    emp3.setNumHoursWorked(47);
    System.out.println(emp3.getFirstName() + " " + emp3.getLastName() + ", SSN: " + emp3.getSocialSecurityNumber()
            + ", Wage: $" + emp3.getWage() + ", Number of hours worked: " + emp3.getNumHoursWorked());

    CommissionEmployee emp4 = new CommissionEmployee();
    emp4.setFirstName("Nicole");
    emp4.setLastName("Dior");
    emp4.setSocialSecurityNumber(444444444);
    emp4.setCommissionRate(15);
    emp4.setGrossSales(50000);
    System.out.println(emp4.getFirstName() + " " + emp4.getLastName() + ", SSN: " + emp4.getSocialSecurityNumber()
            + ", Commission rate: " + emp4.getCommissionRate() + "%, Gross sales: $" + emp4.getGrossSales());

    SalariedEmployee emp5 = new SalariedEmployee();
    emp5.setFirstName("Renwa");
    emp5.setLastName("Chanel");
    emp5.setSocialSecurityNumber(555555555);
    emp5.setWeeklySalary(1700);
    System.out.println(emp5.getFirstName() + " " + emp5.getLastName()
            + ", SSN: " + emp5.getSocialSecurityNumber() + ", Weekly salary: $" + emp5.getWeeklySalary());

    BaseEmployee emp6 = new BaseEmployee();
    emp6.setFirstName("Mike");
    emp6.setLastName("Davenport");
    emp6.setSocialSecurityNumber(666666666);
    emp6.setBaseSalary(95000);
    System.out.println(emp6.getFirstName() + " " + emp6.getLastName()
            + ", SSN: " + emp6.getSocialSecurityNumber() + ", Base salary: $" + emp6.getBaseSalary());

    CommissionEmployee emp7 = new CommissionEmployee();
    emp7.setFirstName("Mahnaz");
    emp7.setLastName("Vaziri");
    emp7.setSocialSecurityNumber(777777777);
    emp7.setCommissionRate(22);
    emp7.setGrossSales(40000);
    System.out.println(emp7.getFirstName() + " " + emp7.getLastName() + ", SSN: " + emp7.getSocialSecurityNumber()
            + ", Commission rate: " + emp7.getCommissionRate() + "%, Gross sales: $" + emp7.getGrossSales());
}