import java.io.BufferedReader;
import java.io.InputStreamReader;

// given sequence is 'IDIDI' then output should be '132546'


class solution{
    private static String getSequence(String arr){
        int n = arr.length();
        int[] res = new int[n+1];
        int low = 1, high = n+1;
        for(int i=0;i<n;i++){
            if(arr.charAt(i)=='I'){
                res[i] = low++;
            }else{
                res[i] = high--;
            }
        }
        res[n] = low;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=n;i++){
            sb.append(res[i]);
        }
        return sb.toString();
    }
    private static String getInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try{
            input = br.readLine();
        }catch(Exception e){
            e.printStackTrace();
        }
        return input;
    }
    public static void main(String[] args){
        String input = getInput();
        System.out.println(getSequence(input));
    }

}



//class solution{
//    private static String getSequence(String arr){
//        String result = "";
//        int max = 0;
//        for( char c : arr.toCharArray() ){
//            if(c=='I'){
//                result += Integer.toString(max);
//                max++;
//            }
//            else{
//                result += Integer.toString(max);
//                max=(max+3)%10;
//            }
//        }
//        return result;
//    }
//    priavte static String getInput(){
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try{
//            return br.readLine();
//    }
//        catch(Exception e){
//            return null;
//        }
//}
//public class MaxNumWithoutRepeatation {
//        String intList = getInput();
//        String answer = getSequence(intList);
//        System.out.println(answer);
//}
//}
