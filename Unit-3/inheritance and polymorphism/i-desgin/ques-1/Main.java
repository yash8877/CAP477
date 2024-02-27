import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User details");
        String input[] = sc.nextLine().split(",");
        System.out.println("Enter the contact details");
        String contactinfo[] = sc.nextLine().split(",");
        ContactDetail contactDetail = new ContactDetail(contactinfo[0], contactinfo[1], contactinfo[2], contactinfo[3],
                contactinfo[4]);
        User user = new User(input[0], contactDetail,input[1], input[2]);
        System.out.println(user);
        sc.close();

    }
}
