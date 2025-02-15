package org.example.com.MultiLevelUniversityCourseManagementSystem;
//7
// Main Class
public class UniversitySystem {
    public static void main(String[] args) {

        //Course objects
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Literature"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics"));

        CourseManagement courseManagement = new CourseManagement();

        //adding courses
        courseManagement.addCourse(examCourse);
        courseManagement.addCourse(assignmentCourse);
        courseManagement.addCourse(researchCourse);

        //displaying list
        System.out.println("University Course List -: ");
        courseManagement.showAllCourses();
    }
}