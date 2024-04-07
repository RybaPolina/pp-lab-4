package employees;

public class Worker extends Employee {
    public String position;

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker: " + super.getName() + ", Salary: " + super.getSalary() + ", Position: " + position;
    } 
}
