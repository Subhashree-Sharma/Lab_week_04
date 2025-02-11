package org.example.com.PersonalizedMealPlanGenerator;

//8
//main class
public class MealPlanApp {
    public static void main(String[] args) {

        //create different meal plans using the generator
        Meal<VegetarianMeal> vegetarianMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        vegetarianMeal.displayMealPlan();

        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());
        veganMeal.displayMealPlan();

        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetoMeal());
        ketoMeal.displayMealPlan();

        Meal<HighProteinMeal> highProteinMeal = MealPlanGenerator.generateMealPlan(new HighProteinMeal());
        highProteinMeal.displayMealPlan();
    }
}