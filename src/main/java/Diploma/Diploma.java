package Diploma;

import java.util.ArrayList;
import java.util.List;

public class Diploma {
    private String studentName;
    private List<Course> courses = new ArrayList<Course>();
    public Diploma(String studentName) {
        this.studentName = studentName;
        //this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addCourses(List<Course> course) {
        courses.addAll(course);
    }

    public double getDiplomaAverage() {
        double diplomaTotalGrade = 0;
        for (Course c : courses) {
            diplomaTotalGrade += c.getGrade();
        }
        return diplomaTotalGrade / courses.size();
    }

    @Override
    public String toString() {
        System.out.println(studentName);
        for (Course c : courses) {
            System.out.println(c.getCourseName() + " " + c.getGrade());
        }
        return "";
    }


}
