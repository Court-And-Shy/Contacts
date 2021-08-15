package Contacts;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Get user first name, last name and phone number , append them
// Split first name and last name with @  ex:

public class Data {


    //VIEW CONTACTS
    public static void viewContacts() {


        try {
            System.out.println("I'm inside of Data class but I'm run in the main through the menu in option 1");




            // If any thing breaks , this is the error message that will run because it caught the error
        } catch (Exception e) {
            System.out.println("I'm sorry, I can't can't you right now.");
        }


    }

    public static void createDirectoryAndFile() {

    }

    //ADD CONTACTS
    public static void addContact(String name, long number) {

        try {
            System.out.println("Adding contact... " + name + " | " + number + " | ");


            String directory = "data";
            String filename = "contacts.txt";

            ArrayList<String> contactInfo = new ArrayList<String>();


            contactInfo.add(name + " | " + number + " | ");


            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);


            // Code That Will Run
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }


            Files.write(dataFile, contactInfo, StandardOpenOption.APPEND);


            // If any thing breaks , this is the error message that will run because it caught the error
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


    //SEARCH CONTACTS
    public static void searchContact(String name) {

        try{
            Scanner scan = new Scanner(new File("contacts.txt"));


            String searchedContactNumber[];

            boolean foundContact = false;

            while(scan.hasNextLine()) {
                searchedContactNumber = scan.nextLine().split(" ");
                if(searchedContactNumber[0].equals(name)){
                    System.out.println("The number associated with " + name + " is " + searchedContactNumber[1]);
                    foundContact = true;
                }
            }


            if(!foundContact) {
                System.out.println("Could not find " + name);
            }

            System.out.println("");

        }catch (IOException e) {
            System.out.println("Sorry, please try again later");
        }


    }

    //DELETE CONTACTS


}
