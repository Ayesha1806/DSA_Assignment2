package DSA_3;
import java.util.Arrays;
import java.util.Scanner;
public class CircularRotational {
    public static void rightRotateByOne(int[] a) {
        int last = a[a.length - 1];
        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];

        }
        a[0] = last;

    }

    public static void rightRotate(int[] a, int n) {

        if (n < 0 || n >= a.length) {
            return;
        }

        for (int i = 0; i < n; i++) {
            rightRotateByOne(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        rightRotate(a, n);

        System.out.println(Arrays.toString(a));


    }
}