public class NumberSquare {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
