package studentdatabaseapp;
import java.util.Scanner;
public class studentDatabaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask how many students we want to add
        System.out.print("Enter Number Of New Students To Enroll: ");
        int numOfStudents = in.nextInt();
        student[] std = new student[numOfStudents];
        //create n number of students
        for (int i = 0; i < numOfStudents; i++){
            std[i] = new student();
            std[i].enroll();
            std[i].payTuition();
        }
        for (int i = 0; i < numOfStudents; i++){
            System.out.println(std[i].toString());
        }
    }
}
