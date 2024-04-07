//import employees.Employee;
//import employees.Manager;
import employees.Worker;

public class Test {
    public static void main(String[] args) {
       
        /* Employee adam = new Employee("Adam", 2.0);
        adam.setSalary(5.0);
        System.out.println(adam.toString());

        Manager krzysio = new Manager("Krzysiek", 100000.0, 5);
        System.out.println(krzysio.toString()); */

        Worker jacek = new Worker("Jacek", 5.0, "Nic nie robi");
        System.out.println(jacek.toString());
    }
}
