import java.util.ArrayList;
import java.io.BufferedWriter;

public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		//write your code here
		for(User u : userList) {
			String content = u.getName() + "," + u.getMobileNumber() + "," + u.getUsername() + "," + u.getPassword() + "\n";
			bw.write(content);
		}
	}
}