public class asterisk {
    public static void main(String[] args) {
        int rows = 5;

        for (int e = 1; e <= rows; e++) {
            // Print spaces
            for (int j = 1; j <= rows - e; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int d = 1; d <= e; d++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
