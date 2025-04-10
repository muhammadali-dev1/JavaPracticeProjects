package lab18;

public class Employee extends Person {
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name;
    }
}
