package homework6e;

public class RecipeIngredient extends Ingredient {
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", quantity=" + quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        RecipeIngredient that = (RecipeIngredient) obj;
        return Float.compare(that.quantity, quantity) == 0;
    }
}
