package org.example.com.AIDrivenResumeScreeningSystem;

//4
//DataScientist class
class DataScientist extends JobRole {
    //constructor
    public DataScientist() {
        super("Data Scientist");
    }

    //get skills
    @Override
    public String getRequiredSkills() {
        return "Python, Machine Learning, Statistics";
    }
}
