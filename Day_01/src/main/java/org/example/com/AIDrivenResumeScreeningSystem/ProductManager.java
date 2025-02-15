package org.example.com.AIDrivenResumeScreeningSystem;
//3
//product manager class
class ProductManager extends JobRole {
    //constructor
    public ProductManager() {
        super("Product Manager");
    }
    //get required skills
    @Override
    public String getRequiredSkills() {
        return "Market Analysis, Agile Methodologies, Leadership";
    }
}
