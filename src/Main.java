import java.util.Scanner;

public class Main {
    // Create a Scanner object to read input
    Scanner sc = new Scanner(System.in);

    void main() {
        // Save user's name/age
        String name = getInput("name");
        int age = Integer.parseInt(getInput("age"));

        // Create a User instance
        User user1 = new User(name, age);
        // Display base user information
        user1.displayInfo();
        IO.println("-------------------------------");

        // Save user's hobby
        String hobby = getInput("hobby");
        // Display user information with hobby and retirement age
        user1.displayInfo(hobby);
    }
    // Helper method to get input from the user
    private String getInput(String query) {
        IO.print("Enter your " + query + ": ");
        return sc.nextLine();
    }
}
