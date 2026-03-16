class PalindromeService {
    
    public boolean check(String input) {
        if (input == null) return false;

        String clean = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeApp {
    public static void main(String[] args) {
        // Create an instance of the service (Object-Oriented)
        PalindromeService service = new PalindromeService();

        String testWord = "Was it a car or a cat I saw?";
        
        if (service.check(testWord)) {
            System.out.println("Valid Palindrome: " + testWord);
        } else {
            System.out.println("Invalid Palindrome: " + testWord);
        }
    }
}
