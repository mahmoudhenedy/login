// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
                String fileName = "data.txt";
                try {
                    File file = new File(fileName);
                    if (file.createNewFile()) {
                        System.out.println("File created successfully: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
        }
    }
}