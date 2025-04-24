import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "studentDetails.txt";
        String name = "Your Name";         
        String rollNo = "Your RollNo";     

        // Writing to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Roll No: " + rollNo);
            System.out.println("Details written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading details from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
