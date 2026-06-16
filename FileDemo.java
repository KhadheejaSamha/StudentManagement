import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("students.txt");

            writer.write("Samha,101,BCA\n");
            writer.write("Amina,102,BCA\n");
            writer.write("Rahul,103,BSc\n");

            writer.close();

            System.out.println("Data saved successfully!");

        } catch (IOException e) {

            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}