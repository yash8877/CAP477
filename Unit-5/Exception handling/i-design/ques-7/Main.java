import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the contact details");
        String contactDetails = scanner.nextLine();

        String[] details = contactDetails.split(",");

        try {
            ContactDetailBO.validate(details[0], details[1]);
            ContactDetail contact = new ContactDetail(details[0], details[1], details[2], details[3], details[4]);
            System.out.println(contact);
        } catch (DuplicateMobileNumberException e) {
            System.out.println("DuplicateMobileNumberException:  "+e.getMessage());
        }
    }
}