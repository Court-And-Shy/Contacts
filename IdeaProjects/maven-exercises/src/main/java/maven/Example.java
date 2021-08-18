package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {


//        StringUtils.reverse();
        //Mainly used to manipulate strings

        //TODO: Tells whether or not what the user entered is a number
        //TODO: Flips the case of the string
        //TODO: Reverses the string

        // Enter Something:, You Entered:
        System.out.println("Enter Something: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You Entered: " + userInput);

        // 1. This is a number or not
        if(!StringUtils.isNumeric(userInput)){
            System.out.println("This is not a number");
        } else {
            System.out.println("This is a number");
        }

        //Flipped Case:
        System.out.println("Flipped Case:" + StringUtils.swapCase(userInput));

        //Reversed Case:
        System.out.println("Reversed: " + StringUtils.reverse(userInput));


    }
}
