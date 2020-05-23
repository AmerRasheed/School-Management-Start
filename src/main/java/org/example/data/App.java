package org.example.data;

import org.example.data.model.CourseDaoList;
import org.example.data.model.StudentDaoList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static char permitOperationContinue() {
        char s3 = ' ';
        char Op = ScannerCallingClass.scannerCharacter(s3);
        return Op;
    }

    public static void invokemenu() {
        System.out.println("You have following options (in Vending Machine              ");
        System.out.println("add()                                          (s) Add (save) Student record ");
        //   System.out.println("findByEmail                                    (e) Find by Email ");
      //  System.out.println("findById                                       (i) Find by Id + size etc.");
        System.out.println("deleteStudent(Student student                  (d) Delete Student");
        //  System.out.println("View all product desctiption                   (n) Find List by Name");
          System.out.println("List<Student> findAll                          (a) Find All Students");



        System.out.println("add()                                          (c) Add (save) Course ");
           System.out.println("findByEmail                                    (e) Find by Email ");
          System.out.println("findById                                       (i) Find by Id + size etc.");
        System.out.println("deleteStudent(Student student                  (k) (khtam course) Delete Course");
          System.out.println("View all product desctiption                   (n) Find List by Name");
        System.out.println("List<Student> findAll                          (m) (Mazmoon)Find All mazmoon (courses)");//  System.out.println("View all products                              (f) Full description");
        //  System.out.println("Description                                    (j) Full description");// Same as description of a single object selected by user in VM


        System.out.println("Register Course                                (r) Register course         ");
        System.out.println("Un-Register Course                             (u) Register course         ");
     /*   System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");*/
    }
    public static LocalDate dateInput(String userInput) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(userInput, dateFormat);


        System.out.println(date);
        return date;
    }

    public static void main(String[] args) {
        System.out.println("SM");

        StudentDaoList studentDao = new StudentDaoList();
        CourseDaoList courseDao = new CourseDaoList();

        boolean hogia=false;
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Do you want to enter operation (Press y ) or you want to exit the program .....(Press n)  (y/n)");
            char flag = sc.next().charAt(0);
            if (flag == 'y') {
                System.out.println();
                System.out.println("Enter your choice");
                invokemenu();
                char permit = sc.next().charAt(0);

                switch (permit) {
                    //Add (or Save) student
                    case 's': {
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Enter student name");
                        String studentName = sc1.nextLine();

                        System.out.println("Enter student email");
                        Scanner sc2 = new Scanner(System.in);
                        String studentEmail = sc1.nextLine();

                        System.out.println("Enter student address");
                        Scanner sc3 = new Scanner(System.in);
                        String studentAddress = sc1.nextLine();

                        Student student1 = new Student(studentName, studentEmail,studentAddress);
                        Student addedStudent = studentDao.saveStudent(student1);
                      /*
                        int sizeb = 0;
                        for (Student s : store) {
                            System.out.println(s);
                            sizeb++;
                        }
                        System.out.println(sizeb);
*/
                    }
                    break;
                    //Find by email
                    case 'e': {
                        Scanner sc24 = new Scanner(System.in);
                        System.out.println("Enter the email of the student to search in the list");
                        String studentEmail = sc24.nextLine();
                       // Student student=studentDao.findByEmail(studentEmail);
                       // System.out.println("The email belongs to "+ student);

                    }
                    break;
                    //Find by Id
                    case 'i': {
                        Scanner sc24 = new Scanner(System.in);
                        System.out.println("Enter the student Id to search in the list");
                        int studentId = sc24.nextInt();
                        Student student=studentDao.findById(studentId);
                        System.out.println("The Id belongs to "+ student);

                    }
                    break;
                    //Find by email
                    case 'n': {

                        Scanner sc24 = new Scanner(System.in);
                        System.out.println("Enter the name of the student to search in the list");
                        String studentName = sc24.nextLine();
                        List<Student> sObject = studentDao.findByName(studentName);

                        //Student student=studentDao.findByEmail(studentEmail);
                       // System.out.println("The email belongs to "+ student);
                    }
                    break;
                    //int delete (or remove) a student
                    case 'd':
                        System.out.println("Enter the NAME of the student, you want to remove from the Student List ");
                        Scanner sc1 = new Scanner(System.in);
                        String idValue = sc1.nextLine();

                        List<Student> reciveStudentList =   studentDao.findAll();

                        for(Student s:reciveStudentList) {
                            if(s.getName().equals(idValue))

                            hogia = studentDao.deleteStudent(s);
                            if(hogia)
                                System.out.println("The student is successfully deleted from the student list");
                                                }
                        break;
                    //Find by name

                    case 'a':
                     List<Student> reciveStudentList1 =   studentDao.findAll();
                     for(Student s:reciveStudentList1)
                     System.out.println(s);
                        break;
                    //Add course
                    case 'c': {
                        Scanner sc24 = new Scanner(System.in);
                        System.out.println("Enter course name");
                        String courseName = sc24.nextLine();

                        System.out.println("Enter course duratoin");
                        Scanner sc21 = new Scanner(System.in);
                        int courseDuration = sc21.nextInt();

                        System.out.println("Enter course start date");

                        Scanner sc25 = new Scanner(System.in);

                        String userInput = sc25.nextLine();

                        LocalDate startDate=dateInput(userInput);

                   /*     System.out.println("Enter student address");
                        Scanner sc22 = new Scanner(System.in);
                        String studentAddress = sc22.nextLine();*/
                        List<Student> students = new ArrayList<>();
                       Course course1 = new Course(courseName, startDate,courseDuration, students);

                        Course  addedCourse = courseDao.saveCourse(course1);
                        //   studentDao.findByEmail();
                    }
                    break;
                    //Remove course
                    case 'k': {
                        System.out.println("Enter the NAME of the course, you want to remove from the course List ");
                        Scanner sc15 = new Scanner(System.in);
                        String idValue1 = sc15.nextLine();

                        List<Course> reciveCourseList =   courseDao.findAll();

                        for(Course c:reciveCourseList) {

                            if(c.getCourseName().equals(idValue1))
                                hogia = courseDao.removeCourse(c);

                            if(hogia)
                                System.out.println("The course is successfully deleted from the course list");
                        }
                    }
                    break;
                    //Find all courses Mazmoon
                    case 'm': {
                        List<Course> recievedCourseList = courseDao.findAll();
                        for(Course c: recievedCourseList)
                            System.out.println(c);

                    }
                    break;
                    //Register Course
                    case 'r':
                        //List<Course> recievedCourseList = courseDao.findAll();
                        Scanner sc31 = new Scanner(System.in);
                        System.out.println("Enter the student Id for registering the course");
                        int studentIdReg= sc31.nextInt();


                        System.out.println("Enter student name");
                        String studentNameReg = sc31.nextLine();
                   //     Course course1 = new Course(courseName, startDate,courseDuration, students);

                     //   Course  addedCourse = courseDao.saveCourse(course1);

                        //reciveStudentList;
                       // Course c1 = new Course()

                    break;
                    //Un-register Course
                    case 'u':

                        Scanner sc32 = new Scanner(System.in);
                        System.out.println("Enter the student Id to un-register the course");
                        int studentIdUnreg= sc32.nextInt();


                        System.out.println("Enter student name");
                        String studentNameUnreg = sc32.nextLine();

                    break;
                }
            }// if condition
            else running = false;
        }// while
    }
}
