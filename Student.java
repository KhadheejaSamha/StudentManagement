import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            System.out.println("\nStudent Added Successfully!");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);

        } else if (choice == 2) {

            System.out.println("Exiting Program...");

        } else {

            System.out.println("Invalid Choice!");

        }

        sc.close();
    }
}