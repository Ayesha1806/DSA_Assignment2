package DSA_3;

public class MaxMinElements {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=a.length;
        int m=a[0].length;
        LargestElment(4,a);
        MinmunColumn(n,m,a);
        LargestElmentRow(n,m,a);
        SmallestRow(n,m,a);

    }

    private static void MinmunColumn(int n, int m, int[][] a) {
        for(int i=0;i<n;i++){
            int MinC=a[0][i];
            for(int j=1;j<m;j++){
                if(a[i][j]<MinC){
                    MinC=a[i][j];
                }
            }
            System.out.print("min column "+MinC+" ");
            System.out.println();
        }
    }

    private static void LargestElmentRow(int n, int m, int[][] a) {
        for(int i=0;i<n;i++){
            int MaxR=a[0][i];
            for(int j=1;j<m;j++){
                if(a[i][j]>MaxR){
                    MaxR=a[i][j];

                }
            }
            System.out.print("miX row "+MaxR+" ");
            System.out.println();
        }
    }

    private static void SmallestRow(int n, int m, int[][] a) {
        for(int i=0;i<n;i++){
            int minR=a[i][0];
            for(int j=1;j<m;j++){
                if(a[i][j]<minR){
                    minR=a[i][j];

                }
            }

            System.out.print("min row "+minR+" ");
            System.out.println();
        }
    }

    private static void LargestElment(int colSize, int[][] a) {
        for(int i=0;i<colSize;i++){
            int maxm=a[0][i];
            for(int j=1;j<a[i].length;j++) {
                if (a[j][i] > maxm) {
                    maxm = a[j][i];

                }
            }
            System.out.print("Maximum element of colomn " +maxm + " ");
            System.out.println();

        }
    }
}
