package Assignment_1;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private String department;
    private int year;
    private String semester;
    private Professor professor;
    private String courseDescription;
    private int enrolledStudents = 0;
    private static final int MAX_ENROLLED_STUDENTS = 30;

    public Course(String name, String department, int year, String semester, Professor professor,
            String courseDescription) {
        this.name = name;
        this.department = department;
        this.year = year;
        this.semester = semester;
        this.professor = professor;
        this.courseDescription = courseDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent() {
        if (enrolledStudents < MAX_ENROLLED_STUDENTS) {
            enrolledStudents++;
        } else {
            System.out.println("Error: course is full");
        }
    }
}

class Professor {
    private String name;
    private String officeNumber;
    private String phoneExtension;
    private List<Course> courses;

    public Professor(String name, String officeNumber, String phoneExtension) {
        this.name = name;
        this.officeNumber = officeNumber;
        this.phoneExtension = phoneExtension;
        this.courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
