package Contacts;

import java.io.IOException;
import java.nio.charset.Charset;
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


    //TODO: VIEW CONTACTS
    public static Charset viewContacts() {


        try {

            String directory = "data";
            String filename = "contacts.txt";

            //Create either a List or an ArrayList
            List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            // Code That Will Run
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }


            for (String line : lines) {
                System.out.println(line);
            }


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

        try {
            String directory = "data";
            String filename = "contacts.txt";

            List<String> searchContact = Files.readAllLines(Paths.get("data", "contacts.txt"));


            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);


            // Code That Will Run
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            Scanner scan = new Scanner(System.in);
            String userResponse = scan.nextLine();

            if (userResponse.contains(name)) {

                for (String line : searchContact) {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
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
