public class Company{
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Kacper Molewski", 10000.0);
        employees[1] = new Employee("Kamila Sczetela", 8500.0);
        employees[2] = new Employee("Polina Rybachuk", 8000.0);
        employees[3] = new Employee("Konrad Cepryński", 10000.0);
        employees[4] = new Employee("Filip Szokalski", 12000.0);

        System.out.println("Pracownik 4:");
        System.out.println(employees[3].toString());

        employees[3].setSalary(12500.0);

        System.out.println("Dane pracowników: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}