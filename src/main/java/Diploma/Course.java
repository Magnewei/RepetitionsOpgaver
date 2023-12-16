package Diploma;

public class Course {
    private String courseName;
    private int grade;

    public Course(String courseName, int grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        if (grade == -3 ||grade == 00 || grade == 02 || grade == 04 || grade == 07 || grade == 10 || grade == 12 ) {
            return grade;
        } else {
            return 00;
        }
    }

    @Override
    public String toString() {
        String print = courseName + " : " + grade;
        return print;
    }
}
