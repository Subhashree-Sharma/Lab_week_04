package org.example.com.PersonalizedMealPlanGenerator;

//6
//Generic class that handles different meal types
public class Meal<T extends MealPlan> {
    private T mealType;

    //constructor
    public Meal(T mealType) {
        this.mealType = mealType;
    }

    //display meal plan
    public void displayMealPlan() {
        System.out.println(mealType.getMealDetails());
    }
}
