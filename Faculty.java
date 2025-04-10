package lab18;

public class Faculty extends Employee {
    private String officeHours;
    private int rank;

    public Faculty(String name, String address, String phoneNumber, String email, double salary, MyDate dateHired, String officeHours, int rank) {
        super(name, address, phoneNumber, email, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name;
    }
}
