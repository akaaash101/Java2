import java.util.Scanner;

/**
 * CourseApp
 */
public class EmployeeApp {
    public static void main(String[] args) {
        /*
         * Employee emp= new Employee(99, "Akaash");
         * Employee mng = new Employee(100, "Marc");
         * emp.setManager(mng);
         */

        Employee mng = new Employee(100, "Marc");
        Employee emp = new Employee(99, "Akaash", mng);
        System.out.println(emp);

    }

}