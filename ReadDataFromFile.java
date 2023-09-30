import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadDataFromFile {
    public static void main(String[] args) {
        String fileName = "data.txt";
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Data read from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            bufferedReader.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Failed");
            e.printStackTrace();
}
}
