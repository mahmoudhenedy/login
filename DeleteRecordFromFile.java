mport java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class DeleteRecordFromFile {
    public static void main(String[] args) {
        String fileName = "data.txt";
        try {
            File inputFile = new File(fileName);
            Scanner scanner = new Scanner(inputFile);

            System.out.println("Enter the record to delete:");
            String recordToDelete = new Scanner(System.in).nextLine();

            StringBuilder fileContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.equals(recordToDelete)) {
                    fileContent.append(line).append("\n");
                }
            }

            scanner.close();

            FileWriter writer = new FileWriter(inputFile);
            writer.write(fileContent.toString());
            writer.close();

            System.out.println("Record deleted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
}
}
