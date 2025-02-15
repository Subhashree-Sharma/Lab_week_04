package org.example.com.MultiLevelUniversityCourseManagementSystem;
//1

//CourseType abstract class
abstract class CourseType {
    private String courseName;

    //constructor
    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    //get course name
    public String getCourseName() {
        return courseName;
    }

    //abstract method
    public abstract String getEvaluationMethod();
}