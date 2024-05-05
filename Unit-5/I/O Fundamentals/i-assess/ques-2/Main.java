import java.io.*;
public class Main {
    public static void main(String[] args) {
        FileUtility fileUtility = new FileUtility();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            Client[] clients = fileUtility.readFileData(reader);
            fileUtility.writeDataToFile(clients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}