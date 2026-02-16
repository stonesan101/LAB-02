public class User {
    // Private fields to store the user's name, age, and hobby
    private final String name;
    private final int age;
    private String hobby;

    // Constructor to initialize the user's name and age
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information about the user
    void displayInfo() {
        IO.println("-------------------------------");
        IO.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method to display additional information about the user
    void displayInfo(String hobby) {
        displayInfo();

        this.hobby = hobby;
        IO.println("Hobby: " + hobby);

        int retirementAge = 65;
        int yearsUntilRetirement = retirementAge - this.age;
        IO.println("I can retire in " + yearsUntilRetirement + " years");
    }
}
