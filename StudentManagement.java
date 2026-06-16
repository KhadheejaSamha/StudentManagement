import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Roll Number: ");
                int rollNo = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                students.add(new Student(name, rollNo, course));

                System.out.println("Student Added Successfully!");

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {

                    System.out.println("\nStudent List:");

                    for (Student s : students) {
                        s.display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter Roll Number to Search: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (Student s : students) {

                    if (s.rollNo == roll) {
                        System.out.println("\nStudent Found:");
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found!");
                }

            } else if (choice == 4) {

                System.out.print("Enter Roll Number to Delete: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).rollNo == roll) {
                        students.remove(i);
                        found = true;
                        System.out.println("Student Deleted Successfully!");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found!");
                }

            } else if (choice == 5) {

                System.out.println("Thank You!");

            } else {

                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}