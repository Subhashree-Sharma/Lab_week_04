package org.example.com.AIDrivenResumeScreeningSystem;
import java.util.ArrayList;
import java.util.List;

//6
// Resume Screening System
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    //constructor
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    //method to show all resumes
    public void showAllResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.displayResumeDetails();
            System.out.println();
        }
    }
}