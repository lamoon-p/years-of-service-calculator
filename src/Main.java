import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Initialize the Employee Object
        EmployeeRequest request1 = new EmployeeRequest();
        request1.setName("Top");
        request1.setSalary(35000);
        request1.setHireDate(LocalDate.parse("2015-03-01"));

        EmployeeRequest request2 = new EmployeeRequest();
        request2.setName("Nan");
        request2.setSalary(18000);
        request2.setHireDate(LocalDate.parse("2013-02-23"));

        Employee employee1 = setEmployeeToDatabase(request1);
        Employee employee2 = setEmployeeToDatabase(request2);

        System.out.println(employee1);
        System.out.println(employee2);

        // calculate years of service

        employee1.yearOfService();
        System.out.println("Year of service: " + employee1.yearOfService());

        employee2.yearOfService2();
        System.out.println("Year of service: " + employee2.yearOfService2());
    }

    // Validation method
    public static Employee setEmployeeToDatabase(EmployeeRequest request) {

        if (request.getName() == null) {
            System.out.println("Please re-enter name.");
        }

        if (!request.getName().matches("[a-zA-Z]+")) {
            System.out.println("Please enter a proper name.");
        }

        if (request.getSalary() == 0) {
            System.out.println("Please re-enter salary.");
        }

        if (request.getHireDate() == null) {
            System.out.println("Please re-enter hire date.");
        }

        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setSalary(request.getSalary());
        employee.setHireDate(request.getHireDate());
        return employee;
    }
}
