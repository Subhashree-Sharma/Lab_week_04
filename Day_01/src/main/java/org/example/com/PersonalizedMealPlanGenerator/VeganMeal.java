package org.example.com.PersonalizedMealPlanGenerator;
//4
//Vegan Meal class
public class VeganMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Vegan Meal:- Plant based diet with no animal products";
    }
}
