package cback;

public class Main {
    public static void main(String args[]) {
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                System.out.printf("%4d", (r * c));
            }
            System.out.println();
        }
    }
}
