package Diploma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<Course>();
        Diploma diploma = new Diploma("Magnus");
        courses.add(new Course("Math", 12));
        courses.add(new Course("Chem", 00));
        courses.add(new Course("English", 4));
        courses.add(new Course("Philosophy", 7));
        courses.add(new Course("Religion studies", 12));
        diploma.addCourses(courses);

        diploma.toString();
        System.out.println(diploma.getDiplomaAverage());

    }
}
