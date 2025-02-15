package org.example.com.PersonalizedMealPlanGenerator;
//5
// Vegetarian Meal class
public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Vegetarian Meal:- Includes vegetables, fruits, grains, and dairy";
    }
}