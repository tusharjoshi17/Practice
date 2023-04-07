public class TwoDArray {
    public static void main(String[] args) {
        int [][] A={{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        for(int i = 0; i<A.length;i++){
            for(int j = 0;j<A[0].length;j++){
                System.out.print(A[i][j]);
            }
            System.out.println("");
        }
        for(int X[]: A){
            for(int Y:X){
                System.out.println(Y);
            }
        }
    }


}
