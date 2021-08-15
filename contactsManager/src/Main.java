import Contacts.Contact;
import Contacts.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //MAIN MENU
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
                System.out.println("\nDisplaying all contacts...(Contacts)");
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
                Data.searchContact(scan.nextLine());
                break;
            case 4:
                System.out.println("\nEnter the phone number of the contact you would like deleted. (Number)");
                break;
            case 5:
                System.out.println("\nGood bye!");
                break;
            default:
                break;
        }

    } // END MAIN MENU


    //LOAD DATA
    public static void loadData() throws IOException {

    } // END LOAD DATA

    //List of contacts go here , ArrayList , static

    public static ArrayList<Contact> contacts = new ArrayList<>();


    // MAIN
    public static void main(String[] args) {


        System.out.println("Welcome to Contacts Manager");

        runProgram();


    } // END OF MAIN METHOD

    // RUN PROGRAM
    private static void runProgram() {
        //Main Loop
        // Build out main application loop
        // Accept users choice
        // 1. Print Menu
        // 2. Get input (Bring in input class from other class)
        // 3. Do something with that input
        // 4. First choice we need to work with is Quit **

        boolean programRunning = true;

        //loadData();


        do {
            mainMenu();

            Scanner userInput = new Scanner(System.in);
            int choice = userInput.nextInt();
            if(choice == 5) {
                programRunning = false;
            }

        } while (programRunning);

    } // END OF RUN PROGRAM METHOD


}// END OF MAIN CLASS








// TODO: Currently our Add A New Contact Feature Works
// TODO: We need to get the Exit option to work properly
// TODO: We need to be able to display the contacts
// TODO: We need to be able to search to contacts by name
// TODO: We need to be able to delete an existing contact

// TODO: BONUS SECTION

//TODO: FORMATTING

//      Name | Phone number
//      ---------------
//      Jack Blank | 1231231234
//      Jane Doe | 2342342345
//      Sam Space | 3453453456

//        Name       | Phone number |
//        ---------------------------
//        Jack Blank | 210-567-8923 |
//        Jane Doe   | 789-8902     |
//        Sam Space  | 210-581-8123 |


























//    //this function loads the contacts arraylist with contacts
//    //later i'll retrieve from file
//    String directory = "src/Contacts";
//    String filename = "contacts.txt";
//
//
//    ArrayList<String> individual = new ArrayList<String>();
//        individual.add("Jack@Blank|1231231234");
//
//                Path dataDirectory = Paths.get(directory);
//                Path dataFile = Paths.get(directory, filename);
//
//                try {
//                if (Files.notExists(dataDirectory)) {
//                Files.createDirectories(dataDirectory);
//                }
//                if (!Files.exists(dataFile)) {
//                Files.createFile(dataFile);
//                }
//                } catch (Exception e) {
//                System.out.println("Sorry, File Not Found");
//                }
//
//
//
//                List<String> contentsReadFromFile = Files.readAllLines(dataFile);
//
//        for (String line : contentsReadFromFile) {
//        System.out.println(line);
//        }
