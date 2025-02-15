package org.example.com.MultiLevelUniversityCourseManagementSystem;

//5
//generic Course Class
class Course<T extends CourseType> {
    private T courseType;

    //constructor
    public Course(T courseType) {
        this.courseType = courseType;
    }

    //get course type
    public T getCourseType() {
        return courseType;
    }

    //display course details
    public void displayCourseDetails() {
        System.out.println("Course -: " + courseType.getCourseName() + ", Evaluation Method -: " + courseType.getEvaluationMethod());
    }
}
