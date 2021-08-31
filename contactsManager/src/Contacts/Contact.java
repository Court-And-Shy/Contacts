package Contacts;

import java.util.Scanner;

public class Contact {

    // Contacts

    private String firstName;

    private String lastName;

    private String number;

    //TODO:Constructors
    public Contact(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getfirstName() {
        return lastName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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




    public static void contactApp() {




    }

}
