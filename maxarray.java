public class maxarray {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
        int max = numbers[0];

        for (int e = 1; e < numbers.length; e++) {
            if (numbers[e] > max) {
                max = numbers[e];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
