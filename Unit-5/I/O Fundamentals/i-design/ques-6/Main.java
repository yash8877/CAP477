import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;


public class Main {
	public static void main(String args[]) {
		//write your code here
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));

			ArrayList<User> users = new ArrayList<>();

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of users:");
			int num = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < num; i++) {
					System.out.println("Enter the details of user :" + (i+1));
					String d[] = sc.nextLine().split(",");
					users.add(new User(d[0], d[1], d[2], d[3]));
			}
			UserBO.writeFile(users, bw);

			bw.close();
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}