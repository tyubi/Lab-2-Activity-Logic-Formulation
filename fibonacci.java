public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int e1 = 0, e2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int d = 1; d <= n; d++) {
            System.out.print(e1 + " ");
            int sum = e1 + e2;
            e1 = e2;
            e2 = sum;
        }
    }
}
