public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(number + "   ");
                number++;
            }
            System.out.println();
        }
    }
}
