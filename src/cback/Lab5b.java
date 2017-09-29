// Lab 5b
// Zachary Gibson
// 60975

package cback;

public class Lab5b {
    public static void main(String args[]) {
        double[] a = {1, 0, 0};
        double[] b = {0, 1, 1};
        double[] c = {1, 1, 1};
        double[] d = {0, 0, 1};

        System.out.println("ab=" + distance(a, b) + ", ac=" + distance(a,c) + ", ad=" + distance(a,d));
    }

    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt(
                (point1[0] - point2[0]) * (point1[0] - point2[0]) +
                        (point1[1] - point2[1]) * (point1[1] - point2[1]) +
                        (point1[2] - point2[2]) * (point1[2] - point2[2]));
    }
}
