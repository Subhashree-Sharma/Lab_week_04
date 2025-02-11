package org.example.com.MultiLevelUniversityCourseManagementSystem;
//2

//Specific Course Types
class ExamCourse extends CourseType {
    //constructor
    public ExamCourse(String courseName) {
        super(courseName);
    }

    //return in string format
    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}
