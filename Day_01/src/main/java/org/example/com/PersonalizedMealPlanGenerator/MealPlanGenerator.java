package org.example.com.PersonalizedMealPlanGenerator;
//7
//utility class for meal plan generation
public class MealPlanGenerator {
    //generic method to generate and validate meal plans
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        System.out.println("Generating meal plan...");
        return new Meal<>(mealType);
    }
}

