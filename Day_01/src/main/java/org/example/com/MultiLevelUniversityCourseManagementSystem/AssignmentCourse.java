package org.example.com.MultiLevelUniversityCourseManagementSystem;
//4
// AssignmentCourse class
class AssignmentCourse extends CourseType {
    //constructor
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    //return in string format
    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}
