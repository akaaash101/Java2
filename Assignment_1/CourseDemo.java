package Assignment_1;

public class CourseDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("John Smith", "123A", "555-1234");
        Course c1 = new Course("Introduction to Computer Science", "CS", 2022, "Fall", p1,
                "This course provides an overview of computer science and programming using the Java language.");
        Course c2 = new Course("Data Structures and Algorithm", "CS", 2022, "Spring", p1,
                "This course covers the fundamental concepts of data structures including arrays, lists, and much more.");
        p1.addCourse(c1);
        p1.addCourse(c2);
        c1.enrollStudent();
        c1.enrollStudent();
        c1.enrollStudent();
        System.out.println("Course: " + c1.getName());
        System.out.println("Department: " + c1.getDepartment());
        System.out.println("Year: " + c1.getYear());
        System.out.println("Semester: " + c1.getSemester());
        System.out.println("Course Description :" + c1.getCourseDescription());
        System.out.println("Professor: " + c1.getProfessor().getName());
        System.out.println("Office Number: " + c1.getProfessor().getOfficeNumber());
        System.out.println("Phone Extension: " + c1.getProfessor().getPhoneExtension());
        System.out.println("Enrolled Students: " + c1.getEnrolledStudents());

        System.out.println("========Professor's Courses======");
        for (Course c : p1.getCourses()) {
            System.out.println("Course: " + c.getName());
        }
    }
}
