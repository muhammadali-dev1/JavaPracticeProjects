package homework6e;

public class Ingredient {
    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() {
        return name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    @Override
    public String toString() {
        return name + " (" + measuringUnit + ", " + caloriesPerUnit + " cal/unit)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ingredient that = (Ingredient) obj;
        return caloriesPerUnit == that.caloriesPerUnit &&
                name.equals(that.name) &&
                measuringUnit.equals(that.measuringUnit);
    }
}
