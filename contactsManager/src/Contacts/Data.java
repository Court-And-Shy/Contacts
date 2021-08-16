package Contacts;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

// Get user first name, last name and phone number , append them
// Split first name and last name with @  ex:

public class Data {



    //TODO: VIEW CONTACTS
    public static Charset viewContacts() {


        try {
            System.out.println("I'm inside of Data class but I'm run in the main through the menu in option 1");



            String directory = "data";
            String filename = "contacts.txt";

            //Create either a List or an ArrayList

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            // Code That Will Run
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }



            Files.readAllLines(dataFile, //This is going to be an array list );

            // If any thing breaks , this is the error message that will run because it caught the error
        } catch (IOException e) {
            System.out.println("I'm sorry, I can't can't you right now.");
        }


        return null;
    }

    public static void createDirectoryAndFile() {

    }

    //TODO: ADD CONTACTS
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


    //TODO: SEARCH CONTACTS
    public static void searchContact(String name) {

        try{
            Scanner scan = new Scanner(System.in);


            String searchedContactNumber[];

            boolean foundContact = false;

            while(scan.hasNextLine()) {
                searchedContactNumber = scan.nextLine().split(" ");
                if(searchedContactNumber[0].contains(name)){
                    System.out.println("The number associated with " + name + " is " + searchedContactNumber[1]);
                    foundContact = true;
                }
            }


            if(!foundContact) {
                System.out.println("Could not find " + name);
            }

            System.out.println("");

        }catch (Exception e) {
            System.out.println("Sorry, please try again later");
        }


    }

    //TODO: DELETE CONTACTS
    public static void deleteContact(long number) {



    }

    //TODO: EXIT PROGRAM

    public static void exitProgram() {

        System.exit(0);
    }

}
