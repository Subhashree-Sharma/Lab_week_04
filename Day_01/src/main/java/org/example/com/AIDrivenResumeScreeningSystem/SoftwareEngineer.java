package org.example.com.AIDrivenResumeScreeningSystem;
//2
//software engineer class
class SoftwareEngineer extends JobRole {
    //constructor
    public SoftwareEngineer() {
        super("Software Engineer");
    }
    //get engineer skills
    @Override
    public String getRequiredSkills() {
        return "Java, Python, Data Structures, Algorithms";
    }
}
