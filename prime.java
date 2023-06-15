public class prime {
    public static void main(String[] args) {
        int num = 30; // this is the number to test
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int e = 2; e <= Math.sqrt(num); e++) {
                if (num % e == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
