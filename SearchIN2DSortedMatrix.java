package DSA_3;

public class SearchIN2DSortedMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int i=0;
        int j=a[0].length-1;
        int target=6;
        while(i<a.length && j>=0){
            if(a[i][j]==target){
                System.out.println(" found " +i +" " + j);
                break;
            }
            else if(target>a[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
