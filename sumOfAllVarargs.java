public class sumOfAllVarargs {
    int sum(int...A)
    {
        int sum=0;
for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        sumOfAllVarargs sa = new sumOfAllVarargs();
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int sum = sa.sum(A);
        System.out.println(sum);
    }
}
