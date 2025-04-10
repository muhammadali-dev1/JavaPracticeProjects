package homework6e;

import java.util.HashMap;

public class CookingRecipe {
    private String name;
    private HashMap<String, RecipeIngredient> ingredients;

    public CookingRecipe(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        RecipeIngredient recipeIngredient = ingredients.get(ingredient.getName());
        if (recipeIngredient != null) {
            recipeIngredient.setQuantity(quantity);
        } else {
            ingredients.put(ingredient.getName(), new RecipeIngredient(
                ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity
            ));
        }
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        return ingredients.get(ingredient.getName());
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        return ingredients.get(ingredientName);
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        return ingredients.remove(ingredient.getName());
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        return ingredients.remove(ingredientName);
    }

    public float calculateCalories() {
        float totalCalories = 0;
        for (RecipeIngredient ri : ingredients.values()) {
            totalCalories += ri.getCaloriesPerUnit() * ri.getQuantity();
        }
        return totalCalories;
    }

    public int getNumberOfIngredients() {
        return ingredients.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Recipe Name: ").append(name).append("\nIngredients:\n");
        for (RecipeIngredient ingredient : ingredients.values()) {
            result.append("- ").append(ingredient).append("\n");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CookingRecipe that = (CookingRecipe) obj;
        return name.equals(that.name) && ingredients.equals(that.ingredients);
    }
}
