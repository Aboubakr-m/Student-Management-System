package studentdatabaseapp;
import java.util.Scanner;

public class student {
    private String firstName, lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int ID = 1000;

    public student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade year: ");
        this.gradeYear = in.nextInt();
        setStudentID();
    }
    //generating an id
    private void setStudentID() {
        ID++;
        this.studentID =  gradeYear + "" + ID;
    }
    //Enroll In Courses
    public void enroll() {
        //get inside a loop, user hits Q when he done
        Scanner in = new Scanner(System.in);
        String course;
        do{
            System.out.print("enter course to enroll (Q to quit): ");
            course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            }
            else
                break;
        } while (1 != 0);
    }
    //view balance
    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionBalance);
    }
    //pay tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Payment: $");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You For Your Payment of: $" + payment);
        viewBalance();
    }
    //show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " +  courses +
                "\nBalance: $" + tuitionBalance;
    }
}