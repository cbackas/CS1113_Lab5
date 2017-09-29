// Lab 5a
// Zachary Gibson
// 60975

package cback;

public class Lab5a {
    public static void main(String args[]) {
        double[] a = {1, 0, 0};
        double[] b = {0, 1, 1};
        double[] c = {1, 1, 1};
        double[] d = {0, 0, 1};
        double ab = Math.sqrt(
                (a[0] - b[0]) * (a[0] - b[0]) +
                        (a[1] - b[1]) * (a[1] - b[1]) +
                        (a[2] - b[2]) * (a[2] - b[2]));
        double ac = Math.sqrt(
                (a[0] - c[0]) * (a[0] - c[0]) +
                        (a[1] - c[1]) * (a[1] - c[1]) +
                        (a[2] - c[2]) * (a[2] - c[2]));
        double ad = Math.sqrt(
                (a[0] - d[0]) * (a[0] - d[0]) +
                        (a[1] - d[1]) * (a[1] - d[1]) +
                        (a[2] - d[2]) * (a[2] - d[2]));
        System.out.println("ab=" + ab + ", ac=" + ac + ", ad=" + ad);
    }
}
