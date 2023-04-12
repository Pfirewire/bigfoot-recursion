import utils.Input;

public class Recursion {

    public static int multiplication(int num1, int num2) {
        int total = num1;
        if(num2 == 0){
            return 0;
        }
        return total + multiplication(num1, num2 - 1);
    }

    private static int sumOfNumbersMethod(int number) {
        if (number != 0) {
            return number + sumOfNumbersMethod(number - 1);
        } else {
            return number;
        }
    }

    private static boolean isPalindromeMethod(String word) {
        if(word.length() == 0 || word.length() == 1){
            return true;
        }
        if(word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindromeMethod(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        // ------------------------ Utility class to get user input ------------------------
        Input input = new Input();


        // ------------------------ Sum of numbers from 0 to user's number ------------------------
        System.out.printf("%n%n%nWe will sum all numbers from 0 to your number.%n");
        int userNumber = input.getInt("Enter your number: ");
        int sumOfNumbers = sumOfNumbersMethod(userNumber);
        System.out.printf("The sum of 0 to %d is: %d%n%n%n", userNumber, sumOfNumbers);


        // ------------------------ Checking to see if user's word is a palindrome ------------------------
        System.out.println("We will see if the word you enter is a palindrome.");
        String userWord = input.getString("Enter your word: ");
        boolean isPalindrome = isPalindromeMethod(userWord);
        System.out.printf("Is %s a palindrome? %b%n%n", userWord, isPalindrome);
    }
}
