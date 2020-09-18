package ReverseQuiz;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a String to Reverse: ");
        Scanner scanner = new Scanner(System.in);
        //use nextLine since string can contain spaces
        if (scanner.hasNextLine()) {

            String inputString = scanner.nextLine();
            //fancy java 11 check
            //TODO: considering inputs with only numbers as strings currently
            if (inputString.isBlank() || inputString == null) {
                System.out.println("Input String was empty or null");
                System.exit(0);
            }

            Reverse reverse = new Reverse();

            System.out.println("Simple Reverse Method Output: " + reverse.reverseSimple(inputString));

            System.out.println("Java Library Method Output: " + reverse.reverseWLibrary(inputString));
            
            System.out.println("Recursive Method Output: " + reverse.reverseRecursive(inputString));

        } else {
            System.out.println("hello there");
        }

        scanner.close();
    }
}
