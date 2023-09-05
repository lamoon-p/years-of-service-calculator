import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private int salary;
    private LocalDate hireDate;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Years of service calculation method
    public int yearOfService() {

        LocalDate date1 = hireDate;
        LocalDate date2 = LocalDate.now();
        Period period = date1.until(date2);
        return period.getYears();
    }

    public int yearOfService2() {

        return hireDate.until(LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
