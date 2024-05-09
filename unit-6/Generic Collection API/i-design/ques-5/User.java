public class User{
    private String name;
    private String contactNumber;
    private String userName;
    private String email;

    public User(String name, String contactNumber, String userName, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.email = email;
    }

    public void display() {
        System.out.printf("%-20s%-20s%-20s%-20s\n", this.name, this.contactNumber, this.userName, this.email);
    }
}