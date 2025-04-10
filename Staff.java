package lab18;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + name;
    }
}
