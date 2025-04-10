package homework6e;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    private String bookName;
    private List<CookingRecipe> recipes;

    public RecipeBook(String bookName) {
        this.bookName = bookName;
        this.recipes = new ArrayList<>();
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        for (CookingRecipe recipe : recipes) {
            if (recipe.toString().contains(name)) return null;
        }
        CookingRecipe newRecipe = new CookingRecipe(name);
        for (RecipeIngredient ingredient : ingredients) {
            newRecipe.addOrUpdateRecipeIngredient(ingredient, ingredient.getQuantity());
        }
        recipes.add(newRecipe);
        return newRecipe;
    }

    public CookingRecipe removeRecipe(String name) {
        for (CookingRecipe recipe : recipes) {
            if (recipe.toString().contains(name)) {
                recipes.remove(recipe);
                return recipe;
            }
        }
        return null;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        List<CookingRecipe> matchingRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            boolean allMatch = true;
            for (RecipeIngredient ingredient : ingredients) {
                if (recipe.getRecipeIngredient(ingredient.getName()) == null) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) matchingRecipes.add(recipe);
        }
        return matchingRecipes.isEmpty() ? null : matchingRecipes.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        List<CookingRecipe> matchingRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) {
                matchingRecipes.add(recipe);
            }
        }
        return matchingRecipes.isEmpty() ? null : matchingRecipes.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesLowCalories() {
        List<CookingRecipe> lowCalorieRecipes = new ArrayList<>();
        float minCalories = Float.MAX_VALUE;

        for (CookingRecipe recipe : recipes) {
            float recipeCalories = recipe.calculateCalories();
            if (recipeCalories < minCalories) {
                minCalories = recipeCalories;
                lowCalorieRecipes.clear();
                lowCalorieRecipes.add(recipe);
            } else if (recipeCalories == minCalories) {
                lowCalorieRecipes.add(recipe);
            }
        }
        return lowCalorieRecipes.isEmpty() ? null : lowCalorieRecipes.toArray(new CookingRecipe[0]);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Recipe Book: ").append(bookName).append("\nRecipes:\n");
        for (CookingRecipe recipe : recipes) {
            result.append(recipe).append("\n");
        }
        return result.toString();
    }
}
