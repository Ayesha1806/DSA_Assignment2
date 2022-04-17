package DSA_3;

import java.util.Arrays;

public class AntiRoytated {
    public static void main(String[] args) {
    int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(a));

        for(int i=0;i<a.length;i++) {
            for (int j = i; j < a[0].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(a));
        int n=a[0].length;

        for(int j=0;j<a.length;j++){
            for(int i=0;i<n/2;i++) {
                int temp=a[i][j];
                a[i][j]=a[n-i-1][j];
                a[i][n-i-1]=temp;
            }
        }
        System.out.println("rorated array");
        System.out.println(Arrays.deepToString(a));
    }
}
