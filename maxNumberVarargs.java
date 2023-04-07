public class maxNumberVarargs {

    int max(int...A)
    {
        if(A.length==0)
        {
            return Integer.MIN_VALUE;
        }
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maxNumberVarargs mnv = new maxNumberVarargs();
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int max = mnv.max(A);
        System.out.println(max);
    }
}
