import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
            UserBO userBO = new UserBO();
            List<User> userList = userBO.readFromFile(br);
            if (userList.isEmpty()) {
                System.out.println("The list is empty");
            } else {
                userBO.display(userList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}