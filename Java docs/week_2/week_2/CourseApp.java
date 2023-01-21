package week_2;

import java.util.Scanner;

/**
 * CourseApp
 */
public class CourseApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] grades = new int[5];
            // declare and create an array of type Course
            // new to create array
            Course[] courses = new Course[3];
            // create objects
            /*
             * for (int i = 0; i < courses.length; i++)
             * courses[i] = new Course();
             * 
             * System.out.println("Enter the following information");
             * 
             * for (int i = 0; i < courses.length; i++){
             * System.out.print("ID: ");
             * int id= input.nextInt();
             * System.out.print("Name: ");
             * String name= input.next();
             * courses[i].setId(id);
             * courses[i].setName(name);
             * }
             */
            // using constructor with arguments:
            for (int i = 0; i < courses.length; i++) {
                System.out.print("ID: ");
                int id = input.nextInt();
                System.out.print("Name: ");
                String name = input.next();
                courses[i] = new Course(id, name);
            }

            for (int i = 0; i < courses.length; i++)
                System.out.println(courses[i]);
        }

    }

}