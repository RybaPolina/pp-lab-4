import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company{
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Kacper Molewski", 10000.0, 0);
        employees[1] = new Worker("Kamila Sczetela", 8000.0, "Animator");
        employees[2] = new Employee("Polina Rybachuk", 8000.0);
        employees[3] = new Employee("Konrad Cepryński", 10000.0);
        employees[4] = new Worker("Filip Szokalski", 12000.0, "Motion designer");

        /* Pozostałość po zadaniu 1 
        System.out.println("Pracownik 4:");
        System.out.println(employees[3].toString());

        employees[3].setSalary(12500.0); */

        System.out.println("Dane pracowników: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}