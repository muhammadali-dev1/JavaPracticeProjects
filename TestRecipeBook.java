package homework6e;

public class TestRecipeBook {
    public static void main(String[] args) {
        // Create ingredients
        Ingredient sugar = new Ingredient("Sugar", "grams", 4);
        Ingredient flour = new Ingredient("Flour", "grams", 3);
        Ingredient butter = new Ingredient("Butter", "grams", 7);

        // Create recipe ingredients
        RecipeIngredient sugarIngredient = new RecipeIngredient("Sugar", "grams", 4, 100);
        RecipeIngredient flourIngredient = new RecipeIngredient("Flour", "grams", 3, 200);
        RecipeIngredient butterIngredient = new RecipeIngredient("Butter", "grams", 7, 50);

        // Create a recipe book
        RecipeBook recipeBook = new RecipeBook("My Recipe Book");

        // Add recipes
        RecipeIngredient[] cakeIngredients = { sugarIngredient, flourIngredient, butterIngredient };
        CookingRecipe cake = recipeBook.addRecipe("Cake", cakeIngredients);

        // Display recipes
        System.out.println("Added Recipe:");
        System.out.println(cake);

        // Update ingredient
        cake.addOrUpdateRecipeIngredient(butter, 100);
        System.out.println("\nUpdated Recipe:");
        System.out.println(cake);

        // Calculate calories
        System.out.println("\nCalories in Recipe:");
        System.out.println(cake.calculateCalories());

        // Add another recipe
        RecipeIngredient[] pancakeIngredients = { sugarIngredient, flourIngredient };
        CookingRecipe pancake = recipeBook.addRecipe("Pancake", pancakeIngredients);
        System.out.println("\nAdded Another Recipe:");
        System.out.println(pancake);

        // Display low-calorie recipes
        System.out.println("\nLow-calorie recipes:");
        for (CookingRecipe recipe : recipeBook.findRecipesLowCalories()) {
            System.out.println(recipe);
        }
    }
}
