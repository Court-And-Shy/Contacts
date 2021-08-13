package Contacts;

import java.util.Scanner;

public class Contact {

    // Contacts

    private String firstName;

    private String lastName;

    private double number;

    //Constructor
    public Contact(String firstName, String lastName, double number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    // ArrayList of Contacts

    // Would you like to :

    // 1. View Contacts
    // 2. Add A New Contact
    // 3. Search Contacts By Name
    // 4. Delete Existing Contact
    // 5. Exit

    Scanner scan = new Scanner(System.in);

    String userInput = scan.next();

    // Main Menu Display
    // # 2.


    public static void contactApp() {




    }

}
