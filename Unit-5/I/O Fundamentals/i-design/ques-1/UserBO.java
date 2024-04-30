import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserBO {
    public List<User> readFromFile(BufferedReader br) throws IOException {
        List<User> userList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 4) {
                String name = data[0].trim();
                String email = data[1].trim();
                String username = data[2].trim();
                String password = data[3].trim();
                userList.add(new User(name, email, username, password));
            }
        }
        return userList;
    }

    public void display(List<User> list) {
        System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Email", "Username", "Password");
        for (User user : list) {
            System.out.printf("%-15s %-20s %-15s %s\n", user.getName(), user.getEmail(), user.getUsername(), user.getPassword());
        }
    }
}
