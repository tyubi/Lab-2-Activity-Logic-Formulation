public class palindrome {
    public static void main(String[] args) {
        String original = "ROTAVATOR";
        String reversed = "";

        // Reverse the original string
        for (int e = original.length() - 1; e >= 0; e--) {
            reversed += original.charAt(e);
        }

        // Check if the original and reversed strings are equal
        boolean isPalindrome = original.equals(reversed);

        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}
