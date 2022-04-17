package DSA_3;

public class BondaryElement {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                if (i >0 && j > 0 && i>a.length && j>a.length){
                    System.out.print(" ");
                }
                else{
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
