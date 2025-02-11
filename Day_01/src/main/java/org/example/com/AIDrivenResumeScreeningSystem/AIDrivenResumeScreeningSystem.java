package org.example.com.AIDrivenResumeScreeningSystem;
//7

//main class
public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {

        //Resume objects
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Subhashree Sharma", new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>("Diksha sharma", new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>("Riya Dwivedi", new ProductManager());

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();

        //adding resumes
        screeningSystem.addResume(softwareEngineerResume);
        screeningSystem.addResume(dataScientistResume);
        screeningSystem.addResume(productManagerResume);

        //display results
        System.out.println("AI-Driven Resume Screening Results -: ");
        screeningSystem.showAllResumes();
    }
}
