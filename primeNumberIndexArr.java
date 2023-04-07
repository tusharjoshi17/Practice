import java.util.Arrays;
import java.util.Vector;

//public class primeNumberIndexArr {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] prime = new int[arr.length];
//        int[] index = new int[arr.length];
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (PrimeNum.isPrime(arr[i])) {
//                prime[count] = arr[i];
//                index[count] = i;
//                sum += arr[i];
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(prime));
//        System.out.println(Arrays.toString(index));
//        System.out.println(sum);
//    }
//}
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(primeNumberIndexArr(arr));
//    }

//public class primeNumberIndexArr {
//    static int primeSum(int arr[], int n)
//    {
//        // Find maximum value in the array
//        int max_val = Arrays.stream(arr).max().getAsInt();
//
//        // USE SIEVE TO FIND ALL PRIME NUMBERS LESS
//        // THAN OR EQUAL TO max_val
//        // Create a boolean array "prime[0..n]". A
//        // value in prime[i] will finally be false
//        // if i is Not a prime, else true.
//        Vector<Boolean> prime = new Vector<>(max_val + 1);
//        for(int i = 0; i < max_val + 1; i++)
//            prime.add(i,Boolean.TRUE);
//
//        // Remaining part of SIEVE
//        prime.add(0,Boolean.FALSE);
//        prime.add(1,Boolean.FALSE);
//        for (int p = 2; p * p <= max_val; p++)
//        {
//
//            // If prime[p] is not changed, then
//            // it is a prime
//            if (prime.get(p) == true)
//            {
//
//                // Update all multiples of p
//                for (int i = p * 2; i <= max_val; i += p)
//                    prime.add(i,Boolean.FALSE);
//            }
//        }
//
//        // Sum all primes in arr[]
//        int sum = 0;
//        for (int i = 0; i < n; i++)
//            if (prime.get(arr[i]))
//                sum += arr[i];
//
//        return sum;
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        int arr[] = { 1, 2, 3, 4, 5, 6, 7,8,9,10,11};
//        int n = arr.length;
//        System.out.print(primeSum(arr, n));
//    }
//}
public class primeNumberIndexArr {
    public static void main(String[] ar) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int k = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 2; i < a.length; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)

                    count++;
            }

            if (count == 2) {
                s.append(a[i]);
                k += a[i];
            }
        }
        System.out.println(s);
        System.out.println(k);
    }
}
