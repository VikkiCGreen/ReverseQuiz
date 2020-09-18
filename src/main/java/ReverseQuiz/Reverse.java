package ReverseQuiz;

public class Reverse {

    /**
     * @param inputString
     * @return
     */

     //simple for loop that goes thru the input string backward and creates new string
    public String reverseSimple(String inputString) {
        String output = "";
        
        for (int i = inputString.length() - 1; i >= 0; i--) {
            output = output + inputString.charAt(i);
        }

        return output;
    }

    //use Stringbuilder library's reverse function 
    public StringBuilder reverseWLibrary(String inputString) {

        StringBuilder output = new StringBuilder();
        output.append(inputString);
        output.reverse();

        return output;
    }

    //i had to enlist google for assistance; i am weak with recursion
    //this seems weird to me though, isn't this modifying the inputString?
    public String reverseRecursive(String inputString) {

        if (inputString.isEmpty()) {
            return inputString;
        }

        return reverseRecursive(inputString.substring(1)) + inputString.charAt(0);

    }
    
}
