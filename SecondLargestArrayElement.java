public class SecondLargestArrayElement {
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9,12,4,5,46,68,34};
        int max1,max2;
        max1=max2=A[0];
        for(int i = 0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("First big number is "+max1);
        System.out.println("Second big number is "+max2);
    }
}
