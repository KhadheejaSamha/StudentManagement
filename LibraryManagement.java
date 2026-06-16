import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title;
    int bookId;
    boolean issued;

    Book(String title, int bookId) {
        this.title = title;
        this.bookId = bookId;
        this.issued = false;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Status: " + (issued ? "Issued" : "Available"));
        System.out.println("------------------------");
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Book ID: ");
                int bookId = sc.nextInt();
                sc.nextLine();

                books.add(new Book(title, bookId));

                System.out.println("Book Added Successfully!");

            } else if (choice == 2) {

                if (books.isEmpty()) {
                    System.out.println("No books available.");
                } else {
                    for (Book b : books) {
                        b.display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter Book ID to Search: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Book b : books) {

                    if (b.bookId == id) {
                        b.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book Not Found!");
                }

            } else if (choice == 4) {

                System.out.print("Enter Book ID to Issue: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Book b : books) {

                    if (b.bookId == id) {

                        if (!b.issued) {
                            b.issued = true;
                            System.out.println("Book Issued Successfully!");
                        } else {
                            System.out.println("Book Already Issued!");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book Not Found!");
                }

            } else if (choice == 5) {

                System.out.print("Enter Book ID to Return: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Book b : books) {

                    if (b.bookId == id) {

                        if (b.issued) {
                            b.issued = false;
                            System.out.println("Book Returned Successfully!");
                        } else {
                            System.out.println("Book Was Not Issued!");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book Not Found!");
                }

            } else if (choice == 6) {

                System.out.print("Enter Book ID to Delete: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < books.size(); i++) {

                    if (books.get(i).bookId == id) {
                        books.remove(i);
                        System.out.println("Book Deleted Successfully!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book Not Found!");
                }

            } else if (choice == 7) {

                System.out.println("Thank You!");

            } else {

                System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}