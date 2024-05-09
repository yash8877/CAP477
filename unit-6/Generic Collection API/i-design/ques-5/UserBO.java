import java.util.ArrayList;

public class UserBO extends ArrayList<User>{
    public static UserBO getList(){
		UserBO u=new UserBO();
		u.add(new User("mohan Raja","9874563210","mohan","mohan@abc.in"));
		u.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		u.add(new User("Arun kumar","9845671230","arun","arun@abc.in"));
		u.add(new User("prakash raj","7548921445","prakash","raj@abc.in"));
		return u;
	}
    //Your code here

	public void removeUser(int n1, int n2) {
		super.removeRange(n1, n2);

	}

	public static void display(UserBO list) {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");
		for(User u : list) {
			u.display();
		}
	}
}

