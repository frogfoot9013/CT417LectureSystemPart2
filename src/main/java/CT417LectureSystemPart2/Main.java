/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CT417LectureSystemPart2;
import CT417LectureSystem.*;
import java.util.ArrayList;

/**
 *
 * @author Anna Hunt (18484674)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create Students
        Student st1 = new Student("Joe Smith", 2000, 12, 1);
        Student st2 = new Student("Jane Jones", 1999, 11, 29);
        Student st3 = new Student("Saoirse Mullen", 2001, 3, 12);
        Student st4 = new Student("Mary Walshe", 2002, 7, 13);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        
        // create Lecturers
        Lecturer l1 = new Lecturer("John Smith", 1980, 5, 3);
        Lecturer l2 = new Lecturer("Anne Murphy", 1986, 3, 1);
        Lecturer l3 = new Lecturer("Lucy Adams", 1970, 10, 19);
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        lecturers.add(l1);
        lecturers.add(l2);
        lecturers.add(l3);
        
        // create Modules
        CourseModule m1 = new CourseModule("Programming", "C100");
        CourseModule m2 = new CourseModule("Functional Programming", "C102");
        CourseModule m3 = new CourseModule("Introduction to Assembly", "CE150");
        CourseModule m4 = new CourseModule("Introduction to microcontrollers", "CE200");
        
        // create Courses
        CourseProgramme c1 = new CourseProgramme("Computer Science", "CS", 2021, 9, 5, 2022, 5, 15);
        CourseProgramme c2 = new CourseProgramme("Computer Engineering", "CE", 2021, 9, 3, 2022, 5, 25);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        
        // add lecturers to modules
        l1.addLecturerModule(m1);
        l1.addLecturerModule(m3);
        l2.addLecturerModule(m2);
        l2.addLecturerModule(m1);
        l3.addLecturerModule(m4);
        
        // add modules to courses
        c1.addModuleToCourse(m1);
        c1.addModuleToCourse(m2);
        c1.addModuleToCourse(m3);
        
        c2.addModuleToCourse(m1);
        c2.addModuleToCourse(m3);
        c2.addModuleToCourse(m4);
        
        // add students to modules and courses
        st1.addStudentToCourse(c1);
        st1.addModule(m1);
        st1.addModule(m2);
        st1.addModule(m3);
        
        st2.addStudentToCourse(c1);
        st2.addModule(m1);
        st2.addModule(m2);
        st2.addModule(m3);
        
        st3.addStudentToCourse(c2);
        st3.addModule(m1);
        st3.addModule(m3);
        st3.addModule(m4);
        
        st4.addStudentToCourse(c2);
        st4.addModule(m1);
        st4.addModule(m3);
        st4.addModule(m4);
        
        // print courses and their modules
        System.out.println("Courses and their modules:\n");
        for (CourseProgramme c : courses){
            System.out.println("Course name: " + c.getCourseName() + "\nCourse ID: " + c.getCourseId() + "\nModules: ");
            for (CourseModule m : c.getCourseModules()){
                System.out.println("Module name: " + m.getModuleName() + "\nModule ID: " + m.getModuleId() + "\nLecturers: ");
                for (Lecturer l : m.getModuleLecturers()){
                    System.out.println("\nLecturer name:" + l.getName());
                }
            }
            System.out.println("\n");
        }
        
        // print students, usernames, courses, modules
        System.out.println("Registered students:");
        for (Student s : students){
            System.out.println("Name: " + s.getName() + "\nUsername: " + s.getUsername() + "\nModules:");
            for (CourseModule m : s.getStudentModules()){
                System.out.println("Module name: " + m.getModuleName() + "\nModule ID: " + m.getModuleId());
            }
            System.out.println("\nCourses:");
            for (CourseProgramme c : s.getRegisteredCourses()){
                System.out.println("Course name: " + c.getCourseName() + "\nCourse ID: " + c.getCourseId());
            }
            System.out.println("\n");
        }
        
        // print lecturers, usernames, modules
        System.out.println("Registered lecturers:");
        for (Lecturer l : lecturers){
            System.out.println("Name: " + l.getName() + "\nUsername: " + l.getUsername() + "\nTaught Modules:");
            for (CourseModule m : l.getTaughtModules()){
                System.out.println("Module name: " + m.getModuleName() + "\nModule ID: " + m.getModuleId());
            }
            System.out.println("\n");
        }
    }
    
}