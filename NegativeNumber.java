package DSA_3;

public class NegativeNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,-9,5,-7,-18,6};
        int i=0;
        PrintNegative(a,i);
    }

    private static void PrintNegative(int[] a, int i) {
        if(i==a.length){
            return;
        }
        else{
            if(a[i]<0){
                System.out.print( + a[i]+" ");
            }
            PrintNegative(a,i+1);
        }
    }
}
