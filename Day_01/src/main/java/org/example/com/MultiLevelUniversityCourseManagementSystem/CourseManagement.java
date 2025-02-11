package org.example.com.MultiLevelUniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;
//6
//Course Management class
class CourseManagement {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    //method for adding course
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }
    //method to show all courses
    public void showAllCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();
        }
    }
}
