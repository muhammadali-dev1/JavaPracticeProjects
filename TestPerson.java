package lab18;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@example.com");
        Student student = new Student("Jane Doe", "234 Elm St", "555-5678", "jane@example.com", Student.FRESHMAN);
        MyDate hireDate = new MyDate(2020, 1, 15);
        Employee employee = new Employee("Jim Beam", "345 Oak St", "555-8765", "jim@example.com", 50000, hireDate);
        Faculty faculty = new Faculty("Dr. Smith", "456 Pine St", "555-2345", "smith@example.com", 70000, hireDate, "MWF 10-11am", 5);
        Staff staff = new Staff("Alice Johnson", "567 Maple St", "555-3456", "alice@example.com", 45000, hireDate, "Secretary");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
