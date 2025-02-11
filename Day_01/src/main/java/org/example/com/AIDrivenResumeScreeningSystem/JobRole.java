package org.example.com.AIDrivenResumeScreeningSystem;

//1
//Job Role  abstract Class
abstract class JobRole {
    private String jobTitle;

    //constructor
    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //get job title
    public String getJobTitle() {
        return jobTitle;
    }

    //abstract method
    public abstract String getRequiredSkills();
}
