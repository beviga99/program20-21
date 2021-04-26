package Metodoak;

public class Print {

    public static void main(String[] args) {

        int[] array = {7, 8, 52, 60, 25};
        print(array);
    }

    public static void print(int[] array) {
        for (int n = 0; n < 5; n++) {
            if (n == 0) {
                System.out.print("[" + array[0] + ", ");
            } else if (n < 4) {
                System.out.print(array[n] + ", ");
            } else if (n == 4) {
                System.out.print(array[4] + "]");
            }
        }
        System.out.println();
    }
}
