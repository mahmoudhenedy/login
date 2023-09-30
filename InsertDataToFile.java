import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class InsertDataToFile {
}
    public static void main(String[] args) {
        String fileName = "data.txt";
        try {
            FileWriter writer = new FileWriter(fileName, true);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter data to insert into the file (Press Enter to stop):");
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                writer.write(input + "\n");
            }

            writer.close();
            scanner.close();
            System.out.println("Data inserted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

}
}
