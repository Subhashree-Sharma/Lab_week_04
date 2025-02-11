package org.example.com.AIDrivenResumeScreeningSystem;

//5
//Generic Resume Class
class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;

    //constructor
    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    //display resume details
    public void displayResumeDetails() {
        System.out.println("Candidate-> " + candidateName);
        System.out.println("Applying for-> " + jobRole.getJobTitle());
        System.out.println("Required Skills-> " + jobRole.getRequiredSkills());
    }
}