package DSA_3;

public class InsetPosition {
    public static void main(String[] args) {
        int[]a= {1,3,5,6};
        int n=a.length;
        int k=2;
        int result=findIndex(a,n,k);
        System.out.println(result);
    }
    private static int findIndex(int[] a, int n,int k) {
        for(int i = 0; i < n; i++)
            if (a[i] == k)
                return i;
            else if (a[i] > k)
                return i;
        return n;
    }


}
