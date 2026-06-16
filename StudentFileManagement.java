import java.io.*;
import java.util.Scanner;

public class StudentFileManagement {

    public static void addStudent() {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter writer = new FileWriter("students.txt", true);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            writer.write(name + "," + rollNo + "," + course + "\n");

            writer.close();

            System.out.println("Student Saved Successfully!");

        } catch (Exception e) {

            System.out.println("Error Saving Student!");
        }
    }

    public static void viewStudents() {

        try {

            File file = new File("students.txt");

            Scanner reader = new Scanner(file);

            System.out.println("\n----- STUDENT LIST -----");

            while (reader.hasNextLine()) {

                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (Exception e) {

            System.out.println("No Student Records Found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }
}