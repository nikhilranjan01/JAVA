import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6, 7};

        // Sorting the array
        Arrays.sort(numbers);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Searching for an element in the array
        int searchValue = 6;
        int index = Arrays.binarySearch(numbers, searchValue);
        if (index >= 0) {
            System.out.println(searchValue + " found at index " + index);
        } else {
            System.out.println(searchValue + " not found in the array");
        }
    }
}
