import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
		//Your code here
		Scanner sc = new Scanner(System.in);
		List<User> users = new ArrayList<>();

		System.out.println("Enter the number of User details to be added");
		int n = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			System.out.println("Enter the user " + (i+1) + " detail in csv format");
			String d[] = sc.nextLine().split(",");

			users.add(new User(d[0], d[1], d[2], d[3]));
		}

		UserBO ub = UserBO.getList();
		ub.addAll(users);
		
		UserBO.display(ub);
		System.out.println("Enter the range to be removed from array list");
		int x = sc.nextInt();
		int y = sc.nextInt();

		ub.removeUser(x, y);

		UserBO.display(ub);


	}
}
