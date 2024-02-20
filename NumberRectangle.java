public class NumberRectangle {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 6;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
