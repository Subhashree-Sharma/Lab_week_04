package org.example.com.MultiLevelUniversityCourseManagementSystem;
//3

//researchCourse class
class ResearchCourse extends CourseType {
    //constructor
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    //return result in string format
    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}