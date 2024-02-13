import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        try {
            int[] arr = new int[size];

            System.out.println("Enter elements into the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at index " + i + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.println("Array elements:");
            for (int i = 0; i < size; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds! Please enter valid indices.");
        } finally {
            scanner.close();
        }
    }
}
