public class EvenOddSeries {
    public static void main(String[] args) {
        int n = 300; // You can change this value to control the length of the series

        System.out.println("Even numbers:");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nOdd numbers:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
