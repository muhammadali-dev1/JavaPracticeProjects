package lab16;

public class Fan {
    // Constants for fan speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor that sets default values
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    // Accessor methods
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Mutator methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + ", fan is off";
        }
    }

    public static void main(String[] args) {
        // First Fan object with maximum speed, radius 10, color yellow, and turned on
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Second Fan object with medium speed, radius 5, color blue, and turned off
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display fan objects
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
