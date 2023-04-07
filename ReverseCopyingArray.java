public class ReverseCopyingArray {
    public static void main(String[] args) {
     int [] A=new int[10];
     int[] arr ={1,2,3,4,5,6,7,8,9,10};
     for(int i = arr.length-1, j = 0;i>=0;i--,j++){
         A[j]=arr[i];
        }
        for(int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
}
}
