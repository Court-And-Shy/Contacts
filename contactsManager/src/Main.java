import Contacts.Contact;
import Contacts.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    //TODO:MAIN MENU
    public static void mainMenu() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");

        int choice = scan.nextInt();
        scan.nextLine();

        boolean userWantsToExit = true;


        switch (choice) {
            case 1:
                System.out.println("\nDisplaying all contacts...\n");
                System.out.println("Name | Phone number");
                System.out.println("---------------");

                Data.viewContacts();
                break;
            case 2:
                System.out.println("\nAdding new contact... (Firstname Lastname | Number)");

                System.out.println("What is the First and last name?");
                String name = scan.nextLine();
                System.out.println("What is their phone number?");
                long number = scan.nextLong();

                Data.addContact(name, number);
                break;
            case 3:
                System.out.println("\nEnter the Name of contact you would like to search. (Firstname LastName)");
                Data.searchContact();
                break;
            case 4:
                System.out.println("\nEnter the 7-10 digit phone number of the contact you would like deleted. (Number)");
                Data.deleteContact(scan.nextLong());
                break;
            case 5:
                System.out.println("\nGood bye!");
                Data.exitProgram();
                break;
            default:
                break;
        }

    } // END MAIN MENU

    //TODO:LOAD DATA
    public static void loadData() throws IOException {

    } // END LOAD DATA

    //List of contacts go here , ArrayList , static

    public static ArrayList<Contact> contacts = new ArrayList<>();


    //TODO: RUN PROGRAM
    private static void runProgram() {


        boolean programRunning = true;

        //loadData();


        do {
            mainMenu();


        } while (programRunning);

    } // END OF RUN PROGRAM METHOD

    //TODO: MAIN
    public static void main(String[] args) {


        System.out.println("Welcome to Contacts Manager");

        runProgram();


    } // END OF MAIN METHOD

}// END OF MAIN CLASS

