package lab25;

public class IllegalTriangleException extends Exception {
    private static final long serialVersionUID = 1L; // Declare serialVersionUID

    public IllegalTriangleException(String message) {
        super(message); // Pass the message to the superclass constructor
    }
}
