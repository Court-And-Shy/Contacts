import Contacts.Contact;

import java.util.ArrayList;

public class Main {


    public static void mainMenu() {
        System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
    }

    public static void loadData() {
        //this function loads the contacts arraylist with contacts
        //later i'll retrieve from file
        contacts.add(new Contact("Beth","Lee",2101111111));
    }

    //List of contacts go here , ArrayList , static

    public static ArrayList<Contact> contacts = new ArrayList<>();


    public static void main(String[] args) {




        System.out.println("Welcome to Contacts Manager");
        loadData();


        runProgram();


    }

    private static void runProgram() {
        //Main Loop
        // Build out main application loop
        // Accept users choice
        // 1. Print Menu
        // 2. Get input (Bring in input class from other class)
        // 3. Do something with that input
        // 4. First choice we need to work with is Quit **

        do{

        }while ();

    }


}
